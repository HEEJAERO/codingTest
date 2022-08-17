package baekjoon.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931 {
    // 1931 - 회의실 배정
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Meeting[] meetings = new Meeting[n];
        for (int i = 0; i < n; i++) {
            meetings[i] = new Meeting(sc.nextInt(), sc.nextInt());
        }
        //Arrays.sort(meetings); // 클래스에 정렬 기준을 정의하여 사용
        // 2. 람다식을 사용하여 정렬
        Arrays.sort(meetings, (o1, o2) -> {
            if (o1.end == o2.end) return o1.start - o2.start;
            return o1.end - o2.end;
        });
        int count = 0;
        int prev_end_time = 0;
        for (int i = 0; i < n; i++) {
            if(prev_end_time <= meetings[i].start){
                prev_end_time = meetings[i].end;
                count++;
            }
        }
        System.out.println(count);
    }

    static class Meeting implements Comparable<Meeting> {
        // 끝나는 시간을 기준으로 정렬
        int start;
        int end;
        Meeting(int start, int end) {
            this.start = start;
            this.end = end;
        }
        @Override
        public int compareTo(Meeting o) {
            if(this.end== o.end) return this.start - o.start;
            return this.end - o.end;
        }
    }
}

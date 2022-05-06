package chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time> {
    int start;
    int end;

    Time(int start, int end) {
        this.end = end;
        this.start = start;
    }
    @Override
    public int compareTo(Time o) {
        // this - o -> 오름차순
        //  o - this -> 내림차순  -> 현재 - 뒤 가 음수면 오름차순, 현재 - 뒤 가 양수면 내림차순
        if(o.end == this.end) return this.start - o.start ;
        else return this.end - o.end;
    }
}

public class Greedy02 {

    /*public static int Solution(int n, int[][] arr) {
        // 왜 안되나 반례를 한번 생각해보자
        int answer = 0;
        for(int j =0 ;j<n;j++) {
            int end = arr[j][1];
            int count = 1;
            for (int i = 0; i < n; i++) {
                if (i != j && end <= arr[i][0]) {
                    end = arr[i][1];
                    count++;
                }
            }
            answer = Math.max(count, answer);
        }
        return answer;
    }*/
    public static int Solution(int n, ArrayList<Time> list) {
        int count = 0;
        Collections.sort(list);
        int end = 0 ;
        for (Time time : list) {
            if (time.start >= end) {
                count++;
                end = time.end;
            }
        }

        return count;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Time> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(new Time(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(Solution(n, list));
    }
}

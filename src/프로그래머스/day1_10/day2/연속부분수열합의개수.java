package 프로그래머스.day1_10.day2;

import java.util.HashSet;
import java.util.Set;

public class 연속부분수열합의개수 {
    public static int solution(int[] elements) {
        // 3중 포문
        Set<Integer> set = new HashSet<>();
        int n = elements.length;
        int tmp;
        for(int i=0;i<n;i++){ // 원소를 몇개 뽑을꺼임?
            for(int j=0;j<n;j++){ // 시작점
                tmp = 0;
                for(int k=0;k<i;k++){
                    tmp += elements[(j+k)%n];
                }
                set.add(tmp); // 합
            }
        }
        int answer = set.size();
        return answer;
    }
    public static void main(String[] args) {

    }
}

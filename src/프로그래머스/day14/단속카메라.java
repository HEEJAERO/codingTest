package 프로그래머스.day14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 단속카메라 {
    // Level 3 -
    // 그리디라면 한번 정렬을 해보고 푸는것도 나쁘지 않을듯
    // 나중에 한번 다시 풀
    public int solution(int[][] routes) {
        int answer = 1;
        int max = Integer.MAX_VALUE;

        Arrays.sort(routes, (o1, o2) -> o1[0] - o2[0]);
        for(int[] route: routes){
            if(route[0] > max){
                answer++;
                max = route[1];
            }
            max = Math.min(route[1], max);
        }
        return answer;
    }
    public static void main(String[] args) {
        단속카메라 a = new 단속카메라();
        System.out.println(a.solution(new int[][]{{-20, -15}, {-14, -5}, {-18, -13}, {-5, -3}}));

    }
}

package 프로그래머스.day14;

import java.util.Arrays;

public class 숫자게임 {
    // Level 3 - 걍 정렬하고 전체 비교
    public int solution(int[] A, int[] B) {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int pos_a = 0;
        int pos_b = 0;
        int lenA = A.length;
        int lenB = B.length;
        while (pos_a < lenA && pos_b < lenB) {
            if(A[pos_a] < B[pos_b]){
                answer++;
                pos_a++;
                pos_b++;
            }else{
                pos_b++;
            }

        }
        return answer;
    }

}

package 프로그래머스.day6;

import java.util.Stack;

public class 주식가격 {
    // Level 2 -> 해결법 1.  2중 포문
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i=0;i<prices.length;i++){
            int count = 0 ;
            for(int j=i+1;j<prices.length;j++){
                count++;
                if(prices[i]>prices[j]){
                    break;
                }

            }
            answer[i] = count;
        }
        return answer;
    }
    // 2. Stack 사용
    public static int[] solution2(int[] prices) {
        Stack<Integer> beginIdxs = new Stack<>(); // index 를 저장하는 Stack 생성
        int i=0;
        int[] answer = new int[prices.length];

        beginIdxs.push(i); // 스택에 인덱스 0 푸쉬
        for (i=1; i<prices.length; i++) {
            while (!beginIdxs.empty() && prices[i] < prices[beginIdxs.peek()]) {
                int beginIdx = beginIdxs.pop();
                answer[beginIdx] = i - beginIdx;
            }
            beginIdxs.push(i);
        }
        while (!beginIdxs.empty()) {
            int beginIdx = beginIdxs.pop();
            answer[beginIdx] = i - beginIdx - 1;
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}

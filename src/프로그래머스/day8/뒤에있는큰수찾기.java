package 프로그래머스.day8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class 뒤에있는큰수찾기 {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length];
        Arrays.fill(answer, -1);
        // 이중포문 사용시 시간 초과
        int index = 0;
        Stack<Integer> stack = new Stack<>();
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            index = i-1;
            while (!stack.isEmpty() && stack.peek() < numbers[i]) {
                //System.out.println(stack.peek() + " " + index);
                stack.pop();
                //System.out.println(index + " " + numbers[i]);
                while(answer[index]!=-1){
                    index--;
                }
                answer[index] = numbers[i];
                for (int b : answer) {
                    System.out.print(b+" ");
                }
                System.out.println();
            }
            stack.push(numbers[i]);
        }
        //for(int i=0;i<numbers.length;i++) if(answer[i]==0) answer[i] = -1;
        return answer;
    }
    public static void main(String[] args) {
        뒤에있는큰수찾기 a = new 뒤에있는큰수찾기();
        for (int b : a.solution(new int[]{2,3,3,5})) {
            System.out.print(b+" ");
        }
    }
}

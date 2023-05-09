package 프로그래머스.day15;

import java.util.Stack;

public class 택배상자 {
    // Level 3 - pos(현재 좌표) 와 stack 을 활용
    // 마지막에 stack 을 모두 비워주는 연산을 해야함 (마지막 체크)
    public int solution(int[] order) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        int pos = 0;
        int seq = 1;
        while(pos < order.length  && seq<=order.length){
            if(order[pos] != seq){
                if(!stack.isEmpty() && stack.peek() == order[pos]){
                    stack.pop();
                    answer++;
                    pos++;
                }else{
                    stack.add(seq++);
                }
            }else{
                answer++;
                seq++;
                pos++;
            }
        }
        while(!stack.isEmpty()){
            if(order[pos++]==stack.pop()) {
                answer++;
            }
            else break;
        }
        return answer;
    }

    public static void main(String[] args) {
        택배상자 a = new 택배상자();
        System.out.println(a.solution(new int[]{4, 3, 1, 2, 5}));

    }
}

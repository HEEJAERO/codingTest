package baekjoon.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class B10828 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String str = sc.next();


            if (str.equals("push")) {
                stack.push(Integer.parseInt(sc.next()));
            } else if (str.equals("top")) {
                if (stack.isEmpty()) {
                    answer.add(-1);
                }else{
                    answer.add(stack.peek());
                }
            }else if(str.equals("size")){
                answer.add(stack.size());
            }else if(str.equals("pop")){
                if (stack.isEmpty()) {
                    answer.add(-1);
                }else{
                    answer.add(stack.pop());
                }
            } else if (str.equals("empty")) {
                if (stack.isEmpty()) {
                    answer.add(1);
                }else{
                    answer.add(0);
                }
            }
        }
        for (int i = 0; i < answer.size(); i++) {
            System.out.println(answer.get(i));
        }
    }
}

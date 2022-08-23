package baekjoon.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class B10773 {
    //제로
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            int tmp = sc.nextInt();
            if (tmp == 0) {
                stack.pop();
                //System.out.println(stack.pop());
            }else{
                stack.push(tmp);
            }
        }
        int sum = 0;
        System.out.println(stack.size());
        for (int i = 0; i < stack.size(); i++) {
            sum += stack.get(i);
        }
        System.out.println(sum);
    }
}

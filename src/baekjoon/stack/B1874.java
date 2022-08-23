package baekjoon.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class B1874 {
    // 스택 수열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        List<String> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int cur = 1;
        for (int i = 0; i < arr.length; i++) {
            int target = arr[i];
            for (int j = cur; j <= target; j++) {
                cur++;
                stack.add(j);
                answer.add("+");
            }
            if (stack.isEmpty()) { // 위의 연산 후 스택이 비어있으면
                System.out.println("NO");
                return;
            }else {
                int tmp = stack.pop();
                answer.add("-");
                if (tmp != target) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}

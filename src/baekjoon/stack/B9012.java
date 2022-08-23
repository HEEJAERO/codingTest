package baekjoon.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.stream.Collectors;

public class B9012 {
    // 괄호
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<List<Character>> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            List<Character> tmp =s.chars().mapToObj(o ->
                    (char) o).collect(Collectors.toList());
            list.add(tmp);
        }
        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            List<Character> tmp = list.get(i);
            int count = 0;
            for (int j = 0; j < tmp.size(); j++) {
                if (tmp.get(j) == '(') {
                    stack.add(tmp.get(j));
                }else{
                    if (stack.isEmpty()) {
                        break;
                    }
                    stack.pop();
                }
                count++;
            }
            if (stack.isEmpty() && count == tmp.size()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}

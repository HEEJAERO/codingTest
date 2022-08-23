package baekjoon.stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class B4949 {
    // 균형잡힌 세상
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        List<String> list = new ArrayList<>();
        while (true) {
            String str = sc.nextLine();
            if (str.equals(".")) break;
            list.add(str);
        }
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            Stack<Character> stack = new Stack<>();
            boolean end=true;
            for (int j = 0; j < s.length(); j++) {
                char a = s.charAt(j);
                if (a == '[') {
                    stack.push(a);
                } else if (a == '(') {
                    stack.push(a);
                } else if (a == ']') {
                    if (stack.isEmpty() || stack.peek() != '[') {
                        System.out.println("no");
                        end = false;
                        break;
                    } else {
                        stack.pop();
                    }
                } else if (a == ')') {
                    if (stack.isEmpty() || stack.peek() !='(') {
                        System.out.println("no");
                        end=false;
                        break;
                    }else{
                        stack.pop();
                    }
                }
            }
            if (end && stack.isEmpty()) {
                System.out.println("yes");
            } else if(end){
                System.out.println("no");
            }
        }

    }
}

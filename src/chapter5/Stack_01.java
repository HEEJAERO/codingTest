package chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Stack_01 {
    public static String Solution(String str){
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()){
            if(c=='(') stack.push(c);
            else{
                if(stack.empty()) return "NO";
                stack.pop();
            }
        }
        if(stack.empty()) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(Solution(str));
    }
}

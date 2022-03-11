package chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Stack_02 {
    public static Stack<Character> Solution(String str){
        Stack<Character> stack = new Stack<>();
        for(char c: str.toCharArray()){
            if(c==')'){
                while(stack.pop()!='(');
            }else{
                stack.push(c);
            }
        }
        /*String answer="";
        for(int i=0;i< stack.size();i++){
            answer+=stack.get(i);
        }*/
        return stack;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for(char c:Solution(str) )
            System.out.print(c);
    }
}

package 프로그래머스.day1_10.day1;


import java.util.Stack;

public class 괄호회전하기 {
    public static int solution(String s) {
        int answer = 0;
        Stack<Character> stack;
        int n =s.length();
        for(int i=0;i<n;i++){
            s =  s.substring(1,n) + s.substring(0,1);
            stack = new Stack<>();
            for(int j=0;j<n;j++){
                if(!stack.isEmpty()){
                    if(stack.peek()=='(' && s.charAt(j)==')') stack.pop();
                    else if(stack.peek()=='{' && s.charAt(j)=='}') stack.pop();
                    else if(stack.peek()=='[' && s.charAt(j)==']') stack.pop();
                    else stack.push(s.charAt(j));
                }else{
                    stack.add(s.charAt(j));
                }
            }
            if(stack.isEmpty()) answer ++;
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("(){}[]"));
    }
}

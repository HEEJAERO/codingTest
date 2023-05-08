package 프로그래머스.day1_10.day5;
import java.util.Stack;

public class 햄버거만들기 {
    public static int solution(int[] ingredient) {
        int answer = 0;
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<ingredient.length;i++){
            stack.add(ingredient[i]);
            if(stack.size()>=4){
                boolean flag = true;
                for(int j=0;j<4;j++){
                    if(stack.get(stack.size()-4+j) != arr[j]) {
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    for(int j=0;j<4;j++) stack.pop();
                    answer++;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new int[]{2, 1, 1, 2, 3, 1, 2, 3, 1}));
    }
}

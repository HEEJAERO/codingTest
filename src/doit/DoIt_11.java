package doit;

import java.util.*;

public class DoIt_11 {
    // 1874번
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Integer> stack = new Stack<>();
        boolean result=true;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int num = 1;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        List<Character> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]>=num){
                while(arr[i]>=num){
                    stack.push(num);
                    num++;
                    list.add('+');
                }
                stack.pop();
                list.add('-');
            }
            else{
                int tmp = stack.pop();
                if(tmp>arr[i]){
                   result=false;
                   break;
                }else{
                    list.add('-');
                }
            }
        }
        if(result) {
            for (Character c : list) {
                System.out.println(c);
            }
        }else{
            System.out.println("NO");
        }

    }
}

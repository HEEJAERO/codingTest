package doit.datastructure;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class DoIt_12 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] answer = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Stack<Integer> stack = new Stack<>();

        for(int i=0;i<n;i++){
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                answer[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        while (!stack.isEmpty()) { // 값이 배정되지 않은 수들은 -1
            answer[stack.pop()] = -1;
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0;i<n;i++){
            bw.write(answer[i] + " ");
        }
        bw.write("\n");
        bw.flush();


    }
}

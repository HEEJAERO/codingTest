package chapter5;

import java.util.Scanner;
import java.util.Stack;

public class Stack_03 {
    public static int Solution(int[][] board,int[] moves ){
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int pos:moves){

            for(int j=0;j< board.length;j++){
                if(board[j][pos-1] !=0){
                    int pick =board[j][pos-1];
                    board[j][pos-1]=0;
                    if(!stack.empty() && stack.peek() == pick){
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.push(pick);
                    }
                    break;
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[][] board = new int[n][n];
        for(int i = 0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j] = sc.nextInt();
            }
        }
        int num = sc.nextInt();
        int[] moves = new int[num];
        for(int i=0;i<num;i++){
            moves[i]=sc.nextInt();
        }
        System.out.println(Solution(board,moves));
    }
}

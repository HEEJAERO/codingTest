package doit;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DoIt_10 {
    //백준 11003 번 -> deque
    // 시간초과
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 데이터 개수
        int m = sc.nextInt(); // 윈도우

        Deque<Node> deque = new ArrayDeque<>();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        String answer ="";
        answer += arr[0] +" ";
        deque.addFirst(new Node(1, 0));
        for(int i=1;i<n;i++){
            while (!deque.isEmpty() && deque.getLast().value > arr[i]) {
                deque.removeLast(); // 현재 탐색하고 있는 값과 비교하여 더 큰값을 모두 제거
            }
            deque.addLast(new Node(arr[i], i));
            //  이후  window 범위 밖의 node 를 제거
            if(deque.getFirst().index<=i-m){
                deque.removeFirst();
            }
            answer += deque.getFirst().value;
            answer += " ";
        }
        System.out.println(answer);
    }
    static class Node{
        public int value;
        public int index;

        Node(int value, int index) {
            this.value = value;
            this.index = index;
        }
    }

}



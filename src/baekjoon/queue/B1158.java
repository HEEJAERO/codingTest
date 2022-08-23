package baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1158 {
    // 요세푸스 문제
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.add(i + 1);
        }
        int count = 0;
        String answer = "<";
        while (!queue.isEmpty()) {
            count++;
            if (count == k) {
                answer += queue.poll();
                if(!queue.isEmpty()) answer += ", ";
                count = 0;
            }else{
                queue.add(queue.poll());
            }
        }

        answer += ">";
        System.out.println(answer);

    }
}

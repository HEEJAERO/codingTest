package baekjoon.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B2161 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(i + 1);
        }
        String answer = "";
        while (queue.size() != 1) {
            answer += queue.poll() +" ";
            queue.offer(queue.poll());
        }
        answer += queue.peek();
        System.out.println(answer);

    }
}

package doit.datastructure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class DoIt_13 {
    public static void main(String[] args) {
        //2164 - 카드게임
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.add(i + 1);
        }
        while (queue.size() != 1) {
            queue.poll(); // 맨앞의 요소를 하나 없애고
            queue.add(queue.poll()); // 그다음 요소를 맨뒤로 옮긴다.
        }
        System.out.println(queue.peek());
    }
}

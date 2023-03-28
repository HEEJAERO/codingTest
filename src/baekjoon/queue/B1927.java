package baekjoon.queue;

import java.util.*;

public class B1927 {
    // 최소 힙 - 우선순위 큐
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        List<Integer> answer = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a==0){
                if(pq.isEmpty()) answer.add(0);
                else{
                    answer.add(pq.poll());
                }
            }else{
                pq.add(a);
            }
        }


        for(int a:answer){
            System.out.println(a);
        }
    }
}

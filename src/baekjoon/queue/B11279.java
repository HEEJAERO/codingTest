package baekjoon.queue;

import java.util.*;

public class B11279 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2-o1);
        List<Integer> list = new ArrayList<>();
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<N;i++){
            if (arr[i] == 0) {
                if (pq.isEmpty()) {
                    list.add(0);
                } else list.add(pq.poll());
            }else{
                pq.add(arr[i]);
            }
        }
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

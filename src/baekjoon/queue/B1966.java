package baekjoon.queue;

import java.util.*;

public class B1966 {
    // 프린터 큐
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int count = 0;
            Queue<int[]> queue = new LinkedList<>();
            for (int j = 0; j < n; j++) {
                queue.add(new int[]{j, sc.nextInt()});
            }
            while (true) {
                int now[] = queue.remove();
                boolean max = true;
                for (int q[] : queue) {
                    if (q[1] > now[1]) {
                        max=false;
                        break;
                    }
                }
                if(max){
                    count++;
                    if(now[0] == m) break;
                }else{
                    queue.add(now);
                }
            }
            System.out.println(count);
        }
    }
}

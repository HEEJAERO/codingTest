package baekjoon.queue;

import java.util.*;

public class B13335 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int w = sc.nextInt();
        int L = sc.nextInt();
        Queue<Truck> queue = new LinkedList<>();
        List<Truck> onLoad = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            queue.offer(new Truck(sc.nextInt(),w));
        }
        int answer=0;
        int now=1;
        do{
            for (int i = 0; i < onLoad.size(); i++) {
                onLoad.get(i).time--;
                if (onLoad.get(i).time == 0) {
                    L += onLoad.get(i).weight;

                    onLoad.remove(i);
                    i--;
                }
            }
            if (!queue.isEmpty() && L >= queue.peek().weight) {
                Truck poll = queue.poll();
                onLoad.add(poll);
                L-= poll.weight;
                answer = (now+w);
            }
            now++;
        }while (!onLoad.isEmpty());

        System.out.println(answer);
    }

    static class Truck{
        int weight;
        int time;
        public Truck(int weight, int time) {
            this.weight = weight;
            this.time = time;
        }
    }
}

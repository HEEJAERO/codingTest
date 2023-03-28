package inflearn.chapter9;

import java.util.*;
class Load implements Comparable<Load>{
    int point;
    int cost;
    Load(int point, int cost){
        this.point = point;
        this.cost = cost;
    }

    @Override
    public int compareTo(Load o) {
        return this.cost - o.cost;
    }
}
public class Greedy_08 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Greedy_08 s = new Greedy_08();
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<List<Load>> graph = new ArrayList<>();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<>());
        }
        int[] ch = new int[n+1];
        for(int i=0;i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Load(b,c));
            graph.get(b).add(new Load(a,c));
        }
        int answer = 0 ;
        PriorityQueue<Load> pq = new PriorityQueue();
        pq.offer(new Load(1,0));
        while(!pq.isEmpty()){
            Load tmp = pq.poll();
            int point = tmp.point;
            if(ch[point]==0){
                ch[point] =1;
                List<Load> loads = graph.get(point);
                for(int i = 0; i< loads.size(); i++){
                    pq.offer(loads.get(i));
                }
                answer += tmp.cost;
            }
        }
        System.out.println(answer);

    }
}

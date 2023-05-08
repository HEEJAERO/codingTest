package 프로그래머스.day13;
import java.util.Comparator;
import java.util.PriorityQueue;

public class 야근지수 {
    // Level 3 - PriorityQueue  를 이용하여 정렬 및 값 변환 , Comparator.reverserOrder();
    public long solution(int n, int[] works) {
        long answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        for(int w:works) pq.add(w);
        for(int i=0;i<n;i++){
            int a = pq.poll();
            if(a==0) return 0;
            pq.add(a-1);
        }
        for(int a: pq){
            answer += (long) Math.pow(a, 2);
        }
        return answer;
    }

    public static void main(String[] args) {
        야근지수 a = new 야근지수();
        System.out.println(a.solution(4,new int[]{4,3,3}));
    }
}

package 프로그래머스.day9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 다리를지나는트럭 {
    // Level 2 - > 시간 큐 , 트럭큐를 만들어 두개로 비교
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 1;
        Queue<Integer> qTruck = new LinkedList<>();
        Queue<Integer> qTime = new LinkedList<>();
//
//        qTruck.add(truck_weights[0]);
//        qTime.add(bridge_length);
//        weight -= truck_weights[0];
        List<Integer> arrive = new ArrayList<>();
        int seq = 0;
       // answer = 1;
        while (arrive.size() != truck_weights.length ) { // 모두 다 도착했을때 while 문 탈출
            answer ++;
            if(seq < truck_weights.length && weight >= truck_weights[seq]){ // 다리위에 올라갈 수 있다면
                qTruck.add(truck_weights[seq]);
                weight -= truck_weights[seq];
                qTime.add(bridge_length);
                seq++;
            }
            int n = qTruck.size();
            for(int i=0;i<n;i++){
                int tmp = qTime.poll();
                tmp --;
                if(tmp==0){
                    System.out.println(qTruck.peek() + " " + answer);
                    arrive.add(qTruck.peek());
                    weight += qTruck.poll(); // 트런제거 후 다시 weight 증가
                }else{
                    qTime.add(tmp);
                }
            }

        }

        return answer;
    }
    public static void main(String[] args) {
        다리를지나는트럭 a = new 다리를지나는트럭();
        System.out.println(a.solution(100, 100, new int[]{10, 10, 10, 10, 10, 10, 10, 10, 10, 10}));
    }
}

package 프로그래머스.day12;

import java.util.Comparator;
import java.util.PriorityQueue;

public class 이중우선순위큐 {
    public int[] solution(String[] operations) {
        int[] answer;
        PriorityQueue<Integer> pqR = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int count=0;
        for(String operation: operations) {
            if(count==0){ // 0 이라면 pq, pqR 이 비어있어야 함
                pqR = new PriorityQueue<>(Comparator.reverseOrder());
                pq = new PriorityQueue<>();
            }
            if(operation.equals("D 1") && count >0){
                pqR.poll();
                count--;
            }
            else if(operation.equals("D -1") && count>0) {
                pq.poll();
                count--;

            }
            else if(operation.split(" ")[0].equals("I")){
                int num = Integer.parseInt(operation.split(" ")[1]);
                pq.add(num);
                pqR.add(num);
                //System.out.println(operation.split(" ")[0] + " " + num);
                count++;
            }
        }
        if(count==0) return new int[]{0,0};
        answer = new int[]{pqR.peek(),pq.peek()};
        return answer;
    }
    public static void main(String[] args) {
        이중우선순위큐 a = new 이중우선순위큐();
        for (int b : a.solution(new String[]{"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1","I 111"})) {
            System.out.println(b);
        }
    }
}

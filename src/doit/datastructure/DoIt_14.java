package doit.datastructure;

import java.util.PriorityQueue;
import java.util.Scanner;

public class DoIt_14 {
    public static void main(String[] args) {
        // 11286번 - 절대힙 구현 -- 다시 풀어보자 -- 정렬 기준을 재정의하는 부분 공부
        // 우선순위 큐 - 우선순위에 따라 수들을 정렬하여 사용하는 큐, 해당 조건은 사용자가 정의하여 사용할 수 있다.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            int first = Math.abs(o1);
            int second = Math.abs(o2);
            if (first == second) { // 절대값이 같다면
                return o1 > o2 ? 1 : -1;  // 음수 다음 양수가 오도록 설정
                //return 값이 양수이면 뒤인자 -> 앞인자
                // 음수이면 앞인자 -> 뒤인자
            }else{
                return first-second; // 절대값이 작은순으로 정렬
                // first 가 더 크다면 양수가 나와 o2 -> o1 (양수 - 역순)
                // first 가 작다면 음수가 나와  o1 -> o2  (음수 - 정방향)
            }
        });
        String answer = "";
        for(int i=0;i<n;i++){
            int reqeust = sc.nextInt();
            if(reqeust==0){
                if (priorityQueue.isEmpty()) {
                    answer += "0\n";
                }else{
                    answer += priorityQueue.poll() + "\n";
                }
            }else{
                priorityQueue.add(reqeust);
            }
        }
        System.out.println(answer);

    }
}

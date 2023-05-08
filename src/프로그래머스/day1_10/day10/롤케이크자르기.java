package 프로그래머스.day1_10.day10;

import java.util.HashMap;
import java.util.Map;

public class 롤케이크자르기 {
    // Level 2 , Map 을 이용( map.size() == 토핑의 종류, 두개의 크기가 같다면 answer++);
    public int solution(int[] topping) {
        int answer = 0;
        Map<Integer,Integer> p1 = new HashMap<>();
        Map<Integer,Integer> p2 = new HashMap<>();
        for(int top:topping){
            p2.put(top,p2.getOrDefault(top,0)+1);
        }
        for(int top:topping){
            p1.put(top,p1.getOrDefault(top,0)+1);
            p2.put(top,p2.getOrDefault(top,1)-1);
            if(p2.get(top) == 0) p2.remove(top);
            if(p1.size() == p2.size()) answer++;
        }
        return answer;
    }
    public static void main(String[] args) {
        롤케이크자르기 a = new 롤케이크자르기();
        System.out.println(a.solution(new int[]{1, 2, 1, 3, 1, 4, 1, 2}));

    }
}

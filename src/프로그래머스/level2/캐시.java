package 프로그래머스.level2;

import java.util.*;

public class 캐시 {
    public static int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int n = cities.length;
        Deque<String> deque = new ArrayDeque<>();
        if(cacheSize == 0) return n*5;
        String tmp;
        for(int i=0;i<n;i++){
            tmp = cities[i].toLowerCase();
            if(deque.contains(tmp)){
                deque.remove(tmp);
                deque.add(tmp);
                answer ++;
                System.out.println("저거 실행됨 " + answer + " " + deque.size());
            }else{

                if(deque.size()==cacheSize){
                    deque.removeFirst();
                    deque.add(tmp);
                }else{
                    deque.add(tmp);
                }
                answer +=5;
                System.out.println("이거 실행됨 " + answer+ " " + deque.size()) ;
            }

        }
        return answer;
    }
    public static void main(String[] args) {

        System.out.println(solution(3, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"}));
    }
}

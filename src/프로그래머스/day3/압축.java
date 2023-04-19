package 프로그래머스.day3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 압축 {
    // [3차] 압축
    public static int[] solution(String msg) {
        int[] answer = {};
        List<Integer> list = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for(int i=0;i<26;i++){
            map.put(Character.toString('A'+i),i+1);
        }
        int next = 27;
        for(int i=0;i<msg.length();){
            String tmp = "";
            tmp += msg.charAt(i);
            int start = i;
            while(map.getOrDefault(tmp,0)!=0){ // map 에 값이 있을 경우
                i++;
                if(i==msg.length()) break;
                tmp +=msg.charAt(i);
            }
            if(i!=msg.length())map.put(tmp,next); // i 가 마지막에 도달하면 이것은 값에 안넣음
            next++;
            list.add(map.get(tmp.substring(0,i-start)));

            //System.out.println(tmp.substring(0,i-start) + " " + i);
        }
        //for(int a:list) System.out.println(a);
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution("KAKAO"));
    }
}

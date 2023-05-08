package 프로그래머스.day1_10.day2;

import java.util.*;

public class 튜플 {
    public static int[] solution(String s) {
        // entry 셋이 어떻게 동작하는지 좀 잘알아두고, 패턴에 익숙해 져야할듯
        int[] answer ;
        String[] strings= s.split("\\{|\\}");

        Map<String, Integer> map = new HashMap<>();
        for (String str : strings) {
            if(!str.equals("") && !str.equals(",")){
                String[] nums = str.split(",");
                for (String num : nums) {
                     map.put(num, map.getOrDefault(num, 0) + 1);
                }
            }
        }

        List<Map.Entry<String, Integer>> entryList = new LinkedList<>(map.entrySet());
        entryList.sort((o1, o2) -> map.get(o2.getKey()) - map.get(o1.getKey()));
        answer = new int[map.size()];
        for(int i=0;i<answer.length;i++){
            answer[i] = Integer.parseInt(entryList.get(i).getKey());
        }
        return answer;
    }
    public static void main(String[] args) {
        for(int a:solution("{{4,2,3},{3},{2,3,4,1},{2,3}}")){
            System.out.println(a);
        };
    }
}

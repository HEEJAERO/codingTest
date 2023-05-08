package 프로그래머스.day1_10.day5;

import java.util.HashMap;
import java.util.Map;

public class 대충만든자판 {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for(String s: keymap){
            for(int i=0;i<s.length();i++){
                char tmp = s.charAt(i);
                map.put(tmp,Math.min(i+1,map.getOrDefault(tmp,Integer.MAX_VALUE)));
            }
        }
        int t=0;
        for(String s: targets){
            for(int i=0;i<s.length();i++){
                int b = map.getOrDefault(s.charAt(i),-1);
                if(b==-1){
                    answer[t] = -1;
                    break;
                }else{
                    answer[t] += b;
                }
            }
            t++;
        }
        return answer;
    }

    public static void main(String[] args) {
        for (int a : solution(new String[]{"ABACD", "BCEFD"}, new String[]{"ABCD", "AABB"})) {
            System.out.println(a);
        }
    }
}

package 프로그래머스.day6;

import java.util.HashMap;
import java.util.Map;

public class 둘만의암호 {
    // Level 1
    public static String solution(String s, String skip, int index) {
        String answer = "";
        Map<Character, Boolean> map = new HashMap<>();
        for(int i=0;i<26;i++){
            map.put((char)('a'+i),true);
        }
        for(int i=0;i<skip.length();i++){
            map.put(skip.charAt(i),false);
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            int count = 0;
            while(count<index){
                c++;
                if(c>'z') c-=26;
                if(map.get(c)) count++;
            }
            answer += c;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("aukks","wbqd",5));
    }
}

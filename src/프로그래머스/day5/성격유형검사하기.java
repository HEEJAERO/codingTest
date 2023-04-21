package 프로그래머스.day5;

import java.util.HashMap;
import java.util.Map;

public class 성격유형검사하기 {
    public static String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        int len = survey.length;
        map.put('R',0);
        map.put('T',0);
        map.put('C',0);
        map.put('F',0);
        map.put('J',0);
        map.put('M',0);
        map.put('A',0);
        map.put('N',0);
        for(int i=0;i<len;i++){
            int a;
            char c;
            if(choices[i]>4){
                c= survey[i].charAt(1);
                a= map.get(survey[i].charAt(1))+choices[i]-4;
                map.put(c,a);
            }else if(choices[i]<4){
                c= survey[i].charAt(0);
                a= map.get(survey[i].charAt(0))+4-choices[i];
                map.put(c,a);
            }
        }
        if(map.get('R')>=map.get('T')){
            answer += 'R';
        }else{
            answer += 'T';
        }
        if(map.get('C')>=map.get('F')){
            answer += 'C';
        }else{
            answer += 'F';
        }
        if(map.get('J')>=map.get('M')){
            answer += 'J';
        }else{
            answer += 'M';
        }
        if(map.get('A')>=map.get('N')){
            answer += 'A';
        }else{
            answer += 'N';
        }

        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"AN", "CF", "MJ", "RT", "NA"},new int[]{5, 3, 2, 7, 5}));
    }
}

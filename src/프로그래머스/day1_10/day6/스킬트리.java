package 프로그래머스.day1_10.day6;

import java.util.HashMap;
import java.util.Map;

public class 스킬트리 {
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        int[] arr = new int[skill.length()];
        Map<Character, Integer> map;
        for(String skill_tree: skill_trees){
            map = new HashMap<>();
            for(int i=0;i<skill_tree.length();i++){
                map.put(skill_tree.charAt(i),i);
            }
            arr[0] = map.getOrDefault(skill.charAt(0),Integer.MAX_VALUE);
            boolean flag=true;
            for(int i=1;i<skill.length();i++){
                arr[i] = map.getOrDefault(skill.charAt(i),Integer.MAX_VALUE);
                if(arr[i-1]>arr[i]) {
                    flag = false;
                    break;
                }
            }
            if(flag) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("CBD", new String[]{"BACDE", "CBADF", "AECB", "BDA"}));
    }
}

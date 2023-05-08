package 프로그래머스.day1_10.day5;

import java.util.HashMap;
import java.util.Map;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        String[] answer = {};
        // uid 를 key, 닉네임을 Value 로 갖는 Map
        Map<String,String> map = new HashMap<>();
        // uid 에 해당하는 최종 닉네임을 map 으로 구한뒤
        int len = 0;
        for(String s: record){
            String[] tmp = s.split(" ");
            System.out.println(tmp.length);
            String action = tmp[0];
            String uid = tmp[1];
            String name;

            if(action.equals("Enter") ){
                name = tmp[2];
                map.put(uid,name);
                len++;
            }else if(action.equals("Leave")){
                len ++;
            }
            else{
                name = tmp[2];
                map.put(uid,name);
            }
        }
        // 여기서 uid 에 해당하는 닉네임에 맞게 출력문을 answer 에 넣어줌
        answer = new String[len];
        System.out.println(len);
        int i = 0;
        for(String s: record){
            String[] tmp = s.split(" ");
            String action = tmp[0];
            String uid = tmp[1];
            if(action.equals("Enter") ){
                answer[i] = new String(map.get(uid)+"님이 들어왔습니다.");
                i++;
            }else if(action.equals("Leave")){
                answer[i] = new String(map.get(uid)+"님이 나갔습니다.");
                i++;
            }
        }
        return answer;
    }
}

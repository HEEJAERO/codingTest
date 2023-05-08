package 프로그래머스.day1_10.day2;

import java.util.HashMap;
import java.util.Map;

public class 달리기경주 {
    // Level 1
    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
        Map<String, Integer> rankMap = new HashMap<>();
        Map<Integer,String> pMap = new HashMap<>();
        for(int i=0;i<players.length;i++){
            pMap.put(i+1,players[i]);
            rankMap.put(players[i], i + 1);
        }
        for (String call : callings) {
            int rank = rankMap.get(call); // 순위를 구하고
            String tmp = pMap.get(rank-1); // 전 순위의 사람 이름을 구하고
            pMap.put(rank-1,call);
            pMap.put(rank, tmp);
            rankMap.put(call, rank - 1);
            rankMap.put(tmp, rank);
        }
        answer = pMap.values().toArray(new String[0]);
        return answer;
    }

    public static void main(String[] args) {
        for (String s : solution(new String[]{"mumu", "soe", "poe", "kai", "mine"}, new String[]{"kai", "kai", "mine", "mine"})) {
            System.out.println(s);
        }
    }
}

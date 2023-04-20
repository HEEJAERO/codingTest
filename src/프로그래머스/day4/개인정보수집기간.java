package 프로그래머스.day4;

import java.util.*;

public class 개인정보수집기간 {
    // Level 1
    public static int[] solution(String stringDay, String[] terms, String[] privacies) {
        int[] answer;
        List<Integer> list = new ArrayList<>();
        Map<String,Integer> map = new HashMap<>();
        for(String term: terms){
            String[] tmp = term.split(" ");
            map.put(tmp[0], Integer.parseInt(tmp[1]));
        }

        int[] today = Arrays.stream(stringDay.split("\\."))
                .mapToInt(i -> Integer.parseInt(i))
                .toArray();
        int todaySum = 12*28*today[0] + 28*today[1] + today[2];
        int seq = 0;
        for(String privacy : privacies){
            seq ++;
            String[] tmp = privacy.split(" ");
            String term = tmp[1];
            String[] tmp2 = tmp[0].split("\\.");
            int[] day = Arrays.stream(tmp[0].split("\\."))
                    .mapToInt(i-> Integer.parseInt(i))
                    .toArray();
            int t = map.get(term);
            day[2] --;
            if(day[2]==0){
                day[2] += 28;
                day[1] --;
            }
            day[1] += t;
            if(day[1]>=13){
                day[1] -=12;
                day[0] ++;
            }
            //System.out.println(day[0] + " " + day[1] +" " +day[2]);
            int expire = 12*28*day[0] + 28*day[1]+day[2];
            // 날짜를 비교할때, 이렇게 합으로 바꾸어, 그냥 단위를 날짜로 통일하면 편함
            if(todaySum > expire){
                list.add(seq);
            }
        }
        answer = list.stream().mapToInt(i->i).toArray();
        return answer;
    }

    public static void main(String[] args) {
        solution("2022.05.19",new String[]{"A 6", "B 12", "C 3"},new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
    }
}

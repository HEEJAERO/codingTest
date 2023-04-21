package 프로그래머스.day5;

import java.util.*;

public class 주차요금계산 {
    // Level 2
    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};
        // fees = 기본시간 + 기본요금 + 시간당 + 요금
        // records ->


        Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> totalTime = new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>();
        for(String record: records){
            String[] tmp = record.split(" ");
            String[] tmp2 = tmp[0].split(":");
            int time = 60*Integer.parseInt(tmp2[0]) + Integer.parseInt(tmp2[1]);
            String car = tmp[1];
            String action = tmp[2];
            if(action.equals("IN")) map.put(car,time);
            else if(action.equals("OUT")){
                int inTime = map.remove(car);
                totalTime.put(car,totalTime.getOrDefault(car,0)+time-inTime);
            }
            if(!pq.contains(car)){
                //System.out.println(car);
                pq.add(car);
            }
        }
        if(!map.isEmpty()){
            for(String s: map.keySet()){
                //System.out.println("This is " + s);
                totalTime.put(s,totalTime.getOrDefault(s,0)+23*60+59 - map.get(s));
            }
        }
        answer = new int[pq.size()];
        int i=0;
        while(!pq.isEmpty()){
            String s = pq.poll();
            int time = totalTime.get(s);
            if(time<=fees[0]) answer[i] = fees[1];
            else{
                answer[i] = fees[1] + (int)Math.ceil((time-fees[0])/(double)fees[2])*fees[3];
            }
            //System.out.println(s +" 의 요금은 " + answer[i] + " 주차시간은  "+ time);
            i++;
        }


        return answer;
    }
    public static void main(String[] args) {
        for (int a : solution(new int[]{180, 5000, 10, 600}, new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"})) {
            //System.out.println(a);
        }
    }
}

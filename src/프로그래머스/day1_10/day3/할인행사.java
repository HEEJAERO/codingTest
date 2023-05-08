package 프로그래머스.day1_10.day3;
import java.util.*;
public class 할인행사 {
    public static int solution(String[] want, int[] number, String[] discount) {

        int days = 0;
        Map<String,Integer> map1 = new HashMap<>();
        Map<String,Integer> map2;

        for(int i=0;i<want.length;i++){
            map1.put(want[i], number[i]);
            days += number[i];
        }
        int answer = discount.length-days+1;
        for(int i=0;i<discount.length-days+1;i++){
            map2 = new HashMap<>();
            for(int j=i;j<i+days;j++){
                map2.put(discount[j],map2.getOrDefault(discount[j],0) + 1);
            }
            for(String s: want){
                if(map1.get(s) != map2.getOrDefault(s,-1)){
                    answer --;
                    break;
                };
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"banana", "apple", "rice", "pork", "pot"}, new int[] {3, 2, 2, 2, 1},
                new String[] {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"}));
    }
}

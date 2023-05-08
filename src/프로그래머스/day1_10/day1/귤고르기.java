package 프로그래머스.day1_10.day1;


import java.util.*;

public class 귤고르기 {
    public static int solution(int k, int[] tangerine) {
        // Map 을 이용한 중복제거 후 values 로 갯수만을 list 로 역정렬
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int a:tangerine){
            map.put(a,map.getOrDefault(a,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.values());
        list.sort((o1,o2)-> o2-o1);
        for(int a: list){
            k-=a;
            answer ++;
            if(k<=0){
                return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(solution(1,new int[]{1,2}));
    }
}

package 프로그래머스.day9;

import java.util.Arrays;
import java.util.Random;

public class 가장큰수 {
    public String solution(int[] numbers) {
        String answer = "";
        String[] tmp = new String[numbers.length];
        for(int i=0;i<numbers.length;i++) tmp[i] = String.valueOf(numbers[i]);
        Arrays.sort(tmp, ((o1, o2) ->{
            String s1 = o1+o2;
            String s2 = o2+o1;
            if(Integer.parseInt(s1)> Integer.parseInt(s2)) return -1;
            else if(Integer.parseInt(s1)<Integer.parseInt(s2)) return 1;
            else return 0;
        }));
        for(String s: tmp) answer += s;
        int seq=0;
        while(seq < answer.length() && answer.charAt(seq)=='0') seq++;
        if(seq == answer.length()) return "0";
        return answer;
    }
    public static void main(String[] args) {
        가장큰수 a = new 가장큰수();
        int[] arr = new int[100];
        Random random = new Random();
        for(int i=0;i<100;i++){
            arr[i] = random.nextInt(1);
        }
        //System.out.println(a.solution(new int[]{1213,12,313, 51, 5, 91,919}));
        System.out.println(a.solution(arr));
    }
}

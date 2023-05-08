package 프로그래머스.day1_10.day3;

import java.util.ArrayList;
import java.util.List;

public class 뉴스클러스터링 {
    // 자카드 유사도
    // 반례 abab baba 조심 -> 이 경우 0.5 가 나와야함
    public static int solution(String str1, String str2) {
        int answer = 0;
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        //System.out.println(str1);
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        for(int i=0;i<str1.length()-1;i++){
            String tmp = "";
            for(int j=i;j<i+2;j++){
                if(str1.charAt(j)>='A' && str1.charAt(j) <='Z'){
                    tmp += str1.charAt(j);
                }
            }
            if(tmp.length() == 2) list1.add(tmp);
        }
        // for(String s: list1) System.out.print(s+ " ");
        // System.out.println();
        for(int i=0;i<str2.length()-1;i++){
            boolean flag = true;
            String tmp = "";
            for(int j=i;j<i+2;j++){
                if(str2.charAt(j)>='A' && str2.charAt(j) <='Z'){
                    tmp += str2.charAt(j);
                }
            }
            if(tmp.length() ==2) list2.add(tmp);
        }
        //for(String s: list2) System.out.print(s+ " ");
        // System.out.println();
        int min = 0;
        int max = list1.size() + list2.size();
        // list1.sort(Comparator.naturalOrder());
        // list2.sort(Comparator.naturalOrder());
        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j))){
                    min++;
                    list1.remove(i);
                    list2.remove(j);
                    i--;
                    j--;
                    break;
                }
            }
        }
        max -= min;

        // System.out.println(max + " " +list1.size() + " " + list2.size());
        // System.out.println(min);
        if(max == 0 ) return 65536;
        answer = min*65536/max;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("abab", "baba"));
    }
}

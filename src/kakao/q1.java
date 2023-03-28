package kakao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class q1 {

    public static void main(String[] args) {
        int[] arr = solution("2022.05.19", new String[]{"A 6", "B 12", "C 3"}, new String[]{
                "2021.05.02 A", "2022.07.01 B", "2022.02.19 C", "2022.02.20 C"
        });
        for (int a : arr) {
            System.out.println(a);
        }

    }

    public static int[] solution(String today, String[] terms, String[] privacies) {

        List<Integer> answer = new ArrayList<>();

        String[] date = today.split("\\.");
        HashMap<String, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] s = term.split(" ");
            map.put(s[0], 28 * Integer.parseInt(s[1]));
        }
        int seq = 1;
        for (String privacy : privacies) {
            String[] tmp = privacy.split(" "); // 0 => 기간 1 => 종류

            if (map.get(tmp[1]) <= yearToDays(tmp[0], date)) {
                answer.add(seq);
            }
            seq++;
        }
        int[] ans = new int[answer.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = answer.get(i);
        }
        return ans;
    }

    public static int yearToDays(String s,String[] date){
        String[] split = s.split("\\.");

        int answer = 28 * 12 * (Integer.parseInt(date[0]) - Integer.parseInt(split[0]))
                + 28 * ((Integer.parseInt(date[1]) - Integer.parseInt(split[1])))
                + ((Integer.parseInt(date[2]) - Integer.parseInt(split[2])));

        System.out.println(answer);
        return answer;
    }

}

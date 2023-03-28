package baekjoon.map;

import java.util.*;

public class B1764 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] s1 = s.split(" ");
        int n = Integer.parseInt(s1[0]);
        int m = Integer.parseInt(s1[1]);
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(sc.nextLine(), 1);
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            String s2 = sc.nextLine();
            int tmp = map.getOrDefault(s2, 0);
            if (tmp == 1) {
                list.add(s2);
            }
        }
        //naturalOrder => 오름차순으로 정렬
        list.sort(Comparator.naturalOrder());
        System.out.println(list.size());
        for (String str : list) {
            System.out.println(str);
        }
    }
}

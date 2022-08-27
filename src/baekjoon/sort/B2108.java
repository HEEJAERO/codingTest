package baekjoon.sort;

import java.util.*;

public class B2108 {
    //통계학 - 별로 좋은 풀이법은 아닌듯 나중에 counting 방법으로 다시 풀어보자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            }
            Arrays.sort(arr);
            int count = 0;

            List<Integer> list = new ArrayList<>();
            Set<Integer> integers = map.keySet();
            for(int a:integers){
                int tmp = map.get(a);
                if (tmp > count) {
                    list.clear();
                    list.add(a);
                    count = tmp;
                } else if (tmp == count) {
                    list.add(a);
                }
            }

        list.sort(Comparator.comparingInt(o -> o)); // set 은 순서를 보장해주지 않아 다시 정렬해줘야함
        System.out.println(Math.round((float) sum / n));
            System.out.println(arr[n / 2]); // 중간값        //최빈값 구하기
            if (list.size() > 1) {
                System.out.println(list.get(1));
            } else System.out.println(list.get(0));
            System.out.println(arr[n - 1] - arr[0]); // 범위
    }
}


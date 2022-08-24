package baekjoon.sort;

import java.util.*;

public class B1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        Arrays.sort(arr, (o1,o2)->{
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            }
            return o1.length() - o2.length();
        });
        // 중복제거
        for (int i = 0; i < n-1; i++) {
            if (arr[i].equals(arr[i + 1])) {
                continue;
            }
            System.out.println(arr[i]);
        }
        System.out.println(arr[n-1]);
    }
}

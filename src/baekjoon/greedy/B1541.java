package baekjoon.greedy;

import java.util.Scanner;

public class B1541 {
    public static void main(String[] args) {
        //1541 - 읽어버린 괄호
        // 아이디어 -로 짜르고 , 짤린부분끼리 더하고. 이후 - 연산
        //ex 50-50+40 이면 50 과 50+40 으로 나누고 뒤에 식을 계산
        // 이후 50 - 90 을 진행
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] minus = str.split("-");
        int[] tmp = new int[minus.length];

        for (int i = 0; i < minus.length; i++) {
            String[] plus = minus[i].split("\\+");
            for (int j = 0; j < plus.length; j++) {
                tmp[i] += Integer.parseInt(plus[j]);
            }
        }
        int answer = tmp[0];
        for (int i = 1; i < tmp.length; i++) {
            answer -= tmp[i];
        }
        System.out.println(answer);
    }
}

package baekjoon.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class B4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<int[]> answer = new ArrayList<>();

        while (true) {
            String s = sc.nextLine();
            String[] s1 = s.split(" ");
            if (s1[0].equals("0") && s1[1].equals("0")&& s1[2].equals("0")) {
                break;
            }
            int[] arr = new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] = Integer.parseInt(s1[i]);
            }
            answer.add(arr);
        }
        String[] aa = new String[3];
        for (int i = 0; i < answer.size(); i++) {
            Arrays.sort(answer.get(i));
            if (answer.get(i)[2] * answer.get(i)[2] == answer.get(i)[0] * answer.get(i)[0] +
                    answer.get(i)[1] * answer.get(i)[1]) {
                aa[i] = "right";
            }else{
                aa[i] = "wrong";
            }
        }
        for (String s : aa) {
            System.out.println(s);
        }

    }
}

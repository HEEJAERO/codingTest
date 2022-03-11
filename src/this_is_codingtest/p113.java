package this_is_codingtest;

import java.util.Scanner;

public class p113 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int count=0;
        for (Integer i = 0; i <= Integer.parseInt(n); i++) {
            for (Integer j = 0; j < 60; j++) {
                for (Integer k = 0; k < 60; k++) {
                   if((i.toString()+j.toString()+k.toString()).contains("3")) count++;
                }
            }
        }
            System.out.println(count);

    }
}

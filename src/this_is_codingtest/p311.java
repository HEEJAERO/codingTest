package this_is_codingtest;

import java.util.Arrays;
import java.util.Scanner;

public class p311 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String travelers = sc.nextLine();
        String[] traveler = travelers.split(" ");
        int[] b = new int[traveler.length];
        for (int i = 0; i < traveler.length; i++) {
            b[i] = Integer.parseInt(traveler[i]);
        }
        Arrays.sort(b);
        int temp = 0;
        int count=0;
        for (int i = b.length; i >0;) {
            if(i >= b[i-1]) {
                i=i-b[i-1];
                count++;
            }
        }
        System.out.println(count);
    }
}

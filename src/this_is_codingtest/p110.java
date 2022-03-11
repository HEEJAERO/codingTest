package this_is_codingtest;

import java.util.Scanner;

public class p110 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x=1;
        int y=1;
        sc.nextLine();
        String[] a = sc.nextLine().split(" ");
        for (int i = 0; i < a.length; i++) {
            //String a = sc.next();
            switch (a[i]) {
                case "R":
                    x++;
                    break;
                case "L":
                    x--;
                    break;
                case "U":
                    y--;
                    break;
                case "D":
                    y++;
                    break;
            }
            if (x > n) x--;
            else if (x < 1) x++;
            if (y > n) y--;
            else if (y < 1) y++;
        }
        System.out.println(y);
        System.out.println(x);

    }
}

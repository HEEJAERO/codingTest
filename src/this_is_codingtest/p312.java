package this_is_codingtest;

import java.util.Scanner;

public class p312 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int init = num.charAt(0)-'0';
        for (int i = 1; i < num.length(); i++) {
            int temp = init * (num.charAt(i)-'0');
            System.out.println(temp);
            if (temp == 0 || temp == init)
            {
                init += (num.charAt(i)-'0');

            } else {
                init *= (num.charAt(i)-'0');
            }
        }
        System.out.println(init);

    }
}

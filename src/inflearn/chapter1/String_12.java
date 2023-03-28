package inflearn.chapter1;

import java.util.Scanner;

public class String_12  {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= Integer.parseInt(sc.nextLine());
        String str = sc.nextLine();
        String answer = "";
        for(int i=0;i<n;i++) {
            String temp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(temp,2);
            answer +=(char)num;
            str = str.substring(7);
        }
        System.out.println(answer);
        return ;
    }

}

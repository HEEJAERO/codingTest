package this_is_codingtest;

import java.util.Scanner;

public class p115 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] steps = {{2,1},{-2,1},{2,-1},{-2,-1},{1,2},{-1,2},{1,-2},{-1,-2}};
        String inputData = sc.next();
        int x= inputData.charAt(0) - 'a';
        int y= inputData.charAt(1) - '0';
        int count=0;
        for(int[] step : steps){
            if(x+step[0]>8|| x+step[0]<1) continue;
            if(y+step[1]>8 || y+step[1]<1) continue;
            count++;
//            System.out.println(step[0]);
//            System.out.println(step[1]);
        }
        System.out.println(count);
    }
}

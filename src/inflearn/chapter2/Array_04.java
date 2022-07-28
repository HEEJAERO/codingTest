package inflearn.chapter2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//피보나치 수 출력
public class Array_04 {
    public static List<Integer> Solution(int n){
        List<Integer> arr = new ArrayList<>();

        for(int i=0;i<n;i++) {
            if(i==0 || i==1) {
                System.out.print("1 ");
                arr.add(1);
            }
            else{
                System.out.print(arr.get(i-1)+arr.get(i-2)+" ");
                arr.add(arr.get(i-1)+arr.get(i-2));
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution(n);
    }
}

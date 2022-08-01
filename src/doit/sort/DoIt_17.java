package doit.sort;

import com.sun.jdi.IntegerType;

import java.util.Arrays;
import java.util.Scanner;
/*

public class DoIt_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] arr = new int[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i)-48;
        }
        for(int i=0;i<str.length();i++){
            int max = i;
            for(int j=i+1;j<str.length();j++){
                if (arr[j] > arr[max]) {
                    max = j;
                }
            }
            if(arr[i]<arr[max]){
                int temp = arr[i];
                arr[i] = arr[max];
                arr[max] = temp;
            }
        }
        for (int a : arr) {
            System.out.print(a);
        }

    }
}
*/
public class DoIt_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer[] arr = new Integer[str.length()];
        for(int i=0;i<str.length();i++){
            arr[i] = str.charAt(i)-48;
        }
        Arrays.sort(arr, (o1, o2) -> o2-o1);
        for (int a : arr) {
            System.out.print(a);
        }

    }
}
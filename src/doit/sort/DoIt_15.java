package doit.sort;

import java.util.Scanner;

public class DoIt_15 {
    // 2750 번 -bubble 정렬 - sort 말고 직접 구현해서 해봅시다
    // Arrays.sort() 로 풀어도 되긴함
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int a : arr) {
            System.out.println(a);
        }
    }
}

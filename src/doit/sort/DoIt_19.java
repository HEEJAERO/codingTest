package doit.sort;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class DoIt_19 {
    // 내 풀이 - 11004
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String[] str = s.split(" ");
        int n = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);
        s = br.readLine();
        String[] str1 = s.split(" ");
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(str1[i]);
        }
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
    // quick sort 구현
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        quickSort(arr, 0, n - 1, k - 1);
        System.out.println(arr[k - 1]);
    }

    public static void quickSort(int[] arr, int start, int end, int k) {
        if(start<end){
            int pivot = partition(arr, start, end);
            if (pivot == k) {
                return;
            }else if(k<pivot) quickSort(arr, start, pivot - 1, k);
            else quickSort(arr, pivot + 1, end, k);
        }
    }

    public static int partition(int[] arr, int start, int end) {
        int middle = (start + end) / 2;
        swap(arr, start, middle);
        int pivot = arr[start];
        int i = start, j = end;
        while(i<j){
            while(pivot<arr[j]){
                j--;
            }
            while (i < j && pivot >= arr[i]) {
                i++;
            }
            swap(arr, i, j);
        }
        arr[start] = arr[i];
        arr[i] = pivot;
        return i;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }*/
}

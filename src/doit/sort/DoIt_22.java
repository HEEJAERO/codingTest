package doit.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class DoIt_22 {
    public static int[] arr;
    public static long result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        br.close();
        radixSort(arr, 5);
        for(int i=0;i<n;i++){
            bw.write(arr[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
    public static void radixSort(int[] arr, int max_size) {
        int[] output = new int[arr.length];
        int k = 1;
        int count = 0;
        while (count != max_size) {
            int[] bucket = new int[10];
            for(int i=0;i<arr.length;i++){
                bucket[(arr[i] / k) % 10]++;
            }
            for(int i=1;i<10;i++){
                bucket[i] = bucket[i - 1];
            }
            for (int i = arr.length - 1; i >= 0; i--) {
                output[bucket[(arr[i] / k % 10)] - 1] = arr[i];
                bucket[(arr[i] / k) % 10]++;
            }
            for(int i=0;i<arr.length;i++){
                arr[i] = output[i];
            }
            k = k * 10;
            count++;
        }
    }
}

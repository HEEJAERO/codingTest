package doit.sort;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DoIt_20 {
    // 2751번
   /* public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for (int a : arr) {
            bw.write(a + "\n");
        }
        bw.flush();
    }*/
    public static int[] arr, tmp;
    public static long result;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        arr = new int[n + 1];
        tmp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            System.out.println(arr[i]);
        }
        mergeSort(0, n);

        for(int i =1;i<=n;i++){
            bw.write(arr[i]+"\n");
        }
        bw.flush();
        bw.close();
    }

    public static void mergeSort(int start, int end) {
        if(end-start<1) return; // 두 요소가 같으면 종료
        int middle = start + (end - start) / 2;
        mergeSort(start, middle);
        mergeSort(middle + 1, end);
        for(int i =start;i<=end;i++){
            tmp[i] = arr[i];
        }
        int k = start;
        int index1 = start;
        int index2 = middle + 1;
        while (index1 <= middle && index2 <= end) {
            if (tmp[index1] > tmp[index2]) {
                arr[k] = tmp[index2];
                k++;
                index2++;
            }else{
                arr[k] = tmp[index1];
                k++;
                index1++;
            }
        }
        // 위에는 두개의 배열을 비교하면서 정렬하였고 이제 한쪽에 남은 배열을 모두 출력
        while (index1 <= middle) {
            arr[k] = tmp[index1];
            k++;
            index1++;
        }
        while (index2 <= end) {
            arr[k] = tmp[index2];
            k++;
            index2++;
        }
    }
}

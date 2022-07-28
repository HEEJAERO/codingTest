package inflearn.chapter2;
import java.util.Scanner;
//보이는 사람
public class Array_02 {
    public static int Solution(int[] arr){
        int answer = 1;
        int min = arr[0];
        for(int i=1;i<arr.length;i++){
            if(min<arr[i]){
                answer++;
                min = arr[i];
            }
        }
       return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Solution(arr));
    }
}

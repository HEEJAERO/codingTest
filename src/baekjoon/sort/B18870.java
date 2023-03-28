package baekjoon.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B18870 {
    public static void main(String[] args)  throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N =Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int[] sorted = new int[N];
        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            sorted[i] = arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(sorted);
        // 넣을 때 이미 넣은 값은 중복값이므로 랭킹을 초기화하지 않도록 주의
        int rank = 0;
        for (int v : sorted) {
            if (!map.containsKey(v)) {
                map.put(v, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int key : arr) {
            sb.append(map.get(key) + " ");
        }
        System.out.println(sb);
    }
}

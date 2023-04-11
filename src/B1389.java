import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B1389 {
    // 케빈베이컨의 6단계 법칙, 실버 1
    // BFS or 플루이드 워셜
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tmp = br.readLine().split(" ");
        int n = Integer.parseInt(tmp[0]);
        int m = Integer.parseInt(tmp[1]);
        int[][] arr = new int[n + 1][n + 1];
        int x;
        int y;
        for (int[] i : arr) Arrays.fill(i, 7);
        for(int i=0;i<m;i++){
            tmp = br.readLine().split(" ");
            x = Integer.parseInt(tmp[0]);
            y = Integer.parseInt(tmp[1]);
            arr[x][y] = 1;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    arr[j][k] = Math.min(arr[j][k], arr[j][i] + arr[i][k]);
                }
            }
        }
        int value = Integer.MAX_VALUE;
        int seq=0;
        for(int i=1;i<=n;i++){
            int b=0;
            for (int j = 1; j <= n; j++) {
                if(i==j) continue;
                b += arr[i][j];
                System.out.print(arr[i][j] + " ");
            }
            if (b < value) {
                value = b;
                seq = i;
            }
            System.out.println();
        }
        System.out.println(seq);
    }
}

package baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B16173 {
    // 점프왕 쩰리 - 단방향으로 이동하기 때문에 방문여부를 확인하는 작업은 필요없음
    // 메모리 초과남 나중에 다시 풀어볼것
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = false;
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0});
        while(!queue.isEmpty()){
            int[] point = queue.poll();
            if(point[0]>=n ||point[1]>=n) continue;
            int tmp = arr[point[0]][point[1]];
            if(tmp==-1){
                flag = true;
                break;
            }
            if(point[0]+tmp <n) queue.add(new int[]{point[0] + tmp, point[1]});
            if(point[1] + tmp <n) queue.add(new int[]{point[0], point[1] + tmp});

        }

        if(flag) System.out.println("HaruHaru");
        else System.out.println("Hing");

    }
}


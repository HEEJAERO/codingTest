package baekjoon.bfs;

import java.util.*;

public class B4963 {
    //static Queue<I> queue;
    static int[][] arr;
    static boolean[][] visited;
    static int a;
    static int b;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> answer = new ArrayList<>();

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            int count = 0;
            if(a==0 && b==0) break;

            arr = new int[a][b];
            visited = new boolean[a][b];
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    arr[i][j] = sc.nextInt();
                    //visited[i][j] = false;
                }
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print(arr[i][j]+" ") ;
                    //visited[i][j] = false;
                }
                System.out.println();
            }
            for (int i = 0; i < a; i++) {
                for (int j = 0; j < b; j++) {
                    if (arr[i][j] == 1 && visited[i][j]==false) {
                        //System.out.println(i+" "+ j);
                        bfs4963(i, j);
                        count++;
                    }
                }
            }
            answer.add(count);
        }
        for (int ans : answer) {
            System.out.println(ans);
        }
    }
    public static void bfs4963(int x,int y){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y));
        while(!queue.isEmpty()){
            Node cur = queue.poll();
//            System.out.println(cur.x+" "+ cur.y);
            if(visited[cur.x][cur.y]||arr[cur.x][cur.y]==0) continue;
            visited[cur.x][cur.y]=true;
            if (cur.x < a - 1 && cur.y < b - 1 && arr[cur.x + 1][cur.y + 1] == 1) {
                queue.add(new Node(cur.x + 1, cur.y + 1));
            }
            if (cur.x < a - 1 && cur.y > 0 && arr[cur.x + 1][cur.y - 1] == 1) {
                queue.add(new Node(cur.x + 1, cur.y - 1));
            }
            if (cur.x >0 && cur.y < b - 1 && arr[cur.x -1][cur.y + 1] == 1) {
                queue.add(new Node(cur.x-1,cur.y+1));
            }if (cur.x >0 && cur.y > 0 && arr[cur.x - 1][cur.y - 1] == 1) {
                queue.add(new Node(cur.x-1,cur.y-1));
            }
            if (cur.x<a-1 &&arr[cur.x+1][cur.y] == 1) {
                queue.add(new Node(cur.x+1,cur.y));
            }
            if (x>0 &&arr[cur.x-1][cur.y] == 1) {
                queue.add(new Node(cur.x-1,cur.y));
            }
            if (cur.y<b-1 &&arr[cur.x][cur.y+1] == 1) {
                queue.add(new Node(cur.x,cur.y+1));
            }
            if (cur.y > 0 && arr[cur.x][cur.y - 1] == 1) {
                queue.add(new Node(cur.x, cur.y - 1));
            }
        }
    }
    static class Node{
        int x;
        int y;

        Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}

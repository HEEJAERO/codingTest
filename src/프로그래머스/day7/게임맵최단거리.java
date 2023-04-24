package 프로그래머스.day7;

import java.util.LinkedList;
import java.util.Queue;

public class 게임맵최단거리 {
    static int[] dx = {0,-1,0,1};
    static int[] dy = {-1,0,1,0};
    public int solution(int[][] maps) {
        int goalX = maps[0].length-1;
        int goalY = maps.length-1;
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Queue<Point> queue = new LinkedList<>();
        Point start = new Point(0,0,1);
        queue.add(start);

        visited[0][0] =true;
        Point np;
        int x;
        int y;
        int count;
        while(!queue.isEmpty()){
            np = queue.poll();
            x = np.x;
            y = np.y;
            count = np.count;
            if(x == goalX && y == goalY) {
                return count;
            }
            for(int i=0;i<4;i++){
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx >=0 && nx<=goalX && ny >=0 && ny<=goalY && maps[ny][nx] == 1 && !visited[ny][nx]){
                    queue.add(new Point(nx,ny,count+1));
                    visited[ny][nx] = true;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        게임맵최단거리 a = new 게임맵최단거리();
        System.out.println(a.solution(new int[][]{{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}}));
    }
    class Point{
        int x;
        int y;
        int count;
        Point(int x, int y, int count){
            this.x = x;
            this.y = y;
            this.count = count;
        }
    }
}

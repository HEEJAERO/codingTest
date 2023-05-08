package 프로그래머스.day1_10.day7;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class 방문길이 {
    static int[] dx = {0,0,1,-1};
    static int[] dy = {1,-1,0,0};
    public int solution(String dirs) {
        int answer = 0;
        int x = 0;
        int y = 0;
        Set<Path> set = new HashSet<>();
        for(int i=0;i<dirs.length();i++){
            char dir = dirs.charAt(i);
            int nx;
            int ny;
            if(dir=='U'){
                nx = x + dx[0];
                ny = y + dy[0];
                if(ny<=5){
                    set.add(new Path(x,y,nx,ny));
                    x = nx;
                    y = ny;
                }

            }else if(dir=='D'){
                nx = x + dx[1];
                ny = y + dy[1];
                if(ny >= -5){
                    set.add(new Path(x,y,nx,ny));
                    x = nx;
                    y = ny;
                }
            }else if(dir=='R'){
                nx = x + dx[2];
                ny = y + dy[2];
                if(nx <= 5){
                    set.add(new Path(x,y,nx,ny));
                    x = nx;
                    y = ny;
                }
            }else{
                nx = x + dx[3];
                ny = y + dy[3];
                if(nx >= -5){
                    set.add(new Path(x,y,nx,ny));
                    x = nx;
                    y = ny;
                }
            }
        }


        answer = set.size();
        return answer;
    }
    public static void main(String[] args) {
        방문길이 a = new 방문길이();
        System.out.println(a.solution("ULURRDLLU"));

    }
    class Path{
        int fromX;
        int fromY;
        int toX;
        int toY;

        public Path(int fromX, int fromY, int toX, int toY) {
            this.fromX = fromX;
            this.fromY = fromY;
            this.toX = toX;
            this.toY = toY;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Path)) return false;

            Path p = (Path) o;
            if(this.fromX == p.fromX && this.fromY == p.fromY && this.toX == p.toX && this.toY == p.toY) return true;
            else if(this.fromX == p.toX && this.fromY == p.toY && this.toX == p.fromX && this.toY == p.fromY) return true;
            return false;
        }

        @Override
        public int hashCode() {
            // 출발점, 도착점이 뒤바뀌어도 같다라고 할 수 있도록 두 Path 가 같은 hashCode 값을 갖도록 해야함
            return Objects.hash(toY, toX, fromY, fromX) + Objects.hash(fromY, fromX, toY, toX);
        }
    }
}

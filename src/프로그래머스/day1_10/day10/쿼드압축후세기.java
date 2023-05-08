package 프로그래머스.day1_10.day10;

public class 쿼드압축후세기 {
    // Level 2 - 재귀
    static int zero = 0;
    static int one = 0;
    public int[] solution(int[][] arr) {
        int[] answer = {};
        int n = arr.length;
        compress(n,0,0,arr);
        return new int[]{zero,one};
    }
    void compress(int n,int y, int x, int[][] arr){
        //System.out.println(n);
        int goal = arr[y][x];
        //boolean flag = true; // 쿼드압축을 할 수 잇는지 확인
        for(int i=y;i<y+n;i++){
            for(int j=x;j<x+n;j++){
                if(goal!=arr[i][j]) {
                    compress(n/2,y,x,arr);
                    compress(n/2,y+n/2,x,arr);
                    compress(n/2,y,x+n/2,arr);
                    compress(n/2,y+n/2,x+n/2,arr);
                    return;
                }
            }
        }
        if(goal == 1) one ++;
        else zero++;
    }
    public static void main(String[] args) {
        쿼드압축후세기 a = new 쿼드압축후세기();
        for (int b : a.solution(new int[][]{{1,1,0,0},{1,0,0,0},{1,0,0,1},{1,1,1,1}})) {
            System.out.print(b + " ");
        }

    }
}

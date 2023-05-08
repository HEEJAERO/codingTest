package 프로그래머스.day1_10.day4;

public class 바탕화면정리 {
    public static int[] solution(String[] wallpaper) {
        // Level 1 바탕화면정리
        int[] answer;
        int lengthX = wallpaper[0].length();
        int lengthY = wallpaper.length;
        int minX = lengthX+1;
        int minY = lengthY;
        int maxX = 0;
        int maxY = 0;
        for(int i=0;i<lengthY;i++){
            for(int j=0;j<lengthX;j++){
                if(wallpaper[i].charAt(j)=='#'){ // 파일이 있다면 좌표 4개 갱신 -> i,j,i+1,j+1
                    minX = Math.min(minX,j);
                    maxX = Math.max(maxX,j+1);
                    minY = Math.min(minY,i);
                    maxY = Math.max(maxY,i+1);
                }
            }
        }
        answer = new int[]{minY,minX,maxY,maxX};
        return answer;
    }

    public static void main(String[] args) {
       for(int a:solution(new String[]{".#...", "..#..", "...#."})){
           System.out.println(a);
       };
    }
}

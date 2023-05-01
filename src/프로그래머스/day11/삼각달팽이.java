package 프로그래머스.day11;

public class 삼각달팽이 {
    // Level 2 , 구현 아래,오른쪽, 왼쪽 대각 세가지 경우로 나누어 반복... 각 경우마다 len 을 하나씩 줄여가면서 arr 를 채움
    public int[] solution(int n) {
        int[] answer = new int[n*(n+1)/2];
        int[][] arr = new int[n][n];
        int len = n;
        int ny = -1;
        int nx = 0;
        int now = 1;
        while(len >=0){
            for(int i=0;i< len;i++){
                arr[++ny][nx] = now++;
            }
            len --;
            for(int i=0;i<len;i++){
                arr[ny][++nx] = now++;
            }
            len --;
            for(int i=0;i<len;i++){
                arr[--ny][--nx] = now++;
            }
            len --;
        }
        int pos = 0;
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                answer[pos++] = arr[i][j];
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        삼각달팽이 a = new 삼각달팽이();
        for(int b:a.solution(5)) System.out.print(b+ " ");
    }
}

package 프로그래머스.day2;

public class 행렬의곱셈 {
    public static int[][] solution(int[][] arr1, int[][] arr2) {

        int n = arr1.length;
        int a = arr2.length;
        int m = arr2[0].length;
        int[][] answer = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                for(int k=0;k<a;k++){
                    answer[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
           solution(new int[][]{{1,4},{3,2},{4,1}}, new int[][]{{3,3},{3,3}});
    }
}

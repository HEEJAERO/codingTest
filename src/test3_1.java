import java.util.Scanner;

public class test3_1 {
    public static int[] solution(int rows, int columns, int[][] queries) {
        int[] answer = new int[queries.length];

        int[][] original=new int[rows][columns];
        int count = 1 ;
        for(int i=0;i<rows;i++){
            for(int j = 0 ;j< columns;j++){
                original[i][j] = count;
                count++;
            }
        }
        int min = rows*columns;
        for(int i=0;i< queries.length;i++){
            for(int j = queries[i][0]-1;j<=queries[i][2]-1;j++){
                for(int k = queries[i][1]-1;k<=queries[i][3]-1;k++){
                    if(j<queries[i][0]&&j>queries[i][2]-2 && k<queries[i][1] &&k>queries[i][3]-2 && min>queries[j][k]){
                        min = queries[j][k];
                    }
                }
            }
            answer[i] = min;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       // System.out.println(solution());
    }
}

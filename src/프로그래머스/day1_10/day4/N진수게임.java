package 프로그래머스.day1_10.day4;

public class N진수게임 {
    public static String solution(int n, int t, int m, int p) {
        String answer = "";
        String num = "";
        for(int i=0;i<t*m;i++){
            num += Integer.toString(i,n);
        }
        for(int i=0;i<t;i++){
            answer += num.charAt(i*m + p-1);
        }

        return answer.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(solution(16,16,2,1));
    }
}

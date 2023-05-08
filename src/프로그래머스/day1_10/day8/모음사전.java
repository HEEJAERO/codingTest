package 프로그래머스.day1_10.day8;

public class 모음사전 {
    public static int solution(String word) {
        // dfs or 수학적 접근(6진수)
        int answer = 0;
        char[] arr = {'A','E','I','O','U'};
        int[] num = {781,156,31,6,1};
        for(int i=0;i<word.length();i++){
            for(int j=0;j<5;j++){
                if(arr[j] == word.charAt(i)) answer += j*num[i];
            }
        }
        answer += word.length();
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("I"));
    }
}

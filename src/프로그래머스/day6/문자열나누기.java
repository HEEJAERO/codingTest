package 프로그래머스.day6;

public class 문자열나누기 {
    // Level 1
    public static int solution(String s) {
        int answer = 0;
        char c='1';
        int countS = 0;
        int countD = 0;
        for(int i=0;i<s.length();i++){
            if(countS == 0){
                c = s.charAt(i);
                countS ++;
            }
            else{
                if(c!=s.charAt(i)){
                    countD ++;
                }else countS ++;
            }

            if(countS == countD){ // same == other   이면 count++;
                answer ++;
                countS = 0;
                countD = 0;
            }
        }
        if(countS!= 0) answer ++; // 맨 끝에 남아있는 문자열이 있는 경우 + 1
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("banana"));
    }
}

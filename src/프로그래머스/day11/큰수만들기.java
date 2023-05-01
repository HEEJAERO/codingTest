package 프로그래머스.day11;

public class 큰수만들기 {
    // Level 2 . 그리디, 나중에 다시풀어볼것
    // number.length() - k 길이의 answer 를 구해야함
    // 일단 start ~ k+1 의 범위까지 중에 가장 큰 수의 index 를 구함(이후 answer 의 길이만큼 더해줘야함)
    // 가장 큰 수를 answer 에 더하고
    // start 를 index+1 로 옮겨준다.
    // 이러한 과정을 반복하면서 answer 의 길이가 number.length()- k 가 될때까지 반복
    public String solution(String number, int k) {
        String answer = "";
        StringBuilder sb = new StringBuilder("");
        int len = number.length()-k;
        int start = 0;
        while(start < number.length() && sb.length() != len){
            int leftNum = k + sb.length() + 1;
            int max = 0;
            for (int j = start; j < leftNum; j++) {
                if (max < number.charAt(j) - '0') {
                    max = number.charAt(j) - '0';
                    start = j + 1;
                }
            }
            sb.append(max);
        }
        answer = sb.toString();
        return answer;
    }

    public static void main(String[] args) {
        큰수만들기 a = new 큰수만들기();
        System.out.println(a.solution("4177252841", 4));
    }
}

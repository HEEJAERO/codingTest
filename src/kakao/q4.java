package kakao;

public class q4 {

    public static void main(String[] args) {
        int[] solution = solution(new long[]{7, 5});
        for (int s : solution) {
            System.out.println(s);
        }
    }
    public static int[] solution(long[] numbers) {
        int[] answer = new int[numbers.length];
        int seq = 0;
        for (long number : numbers) {
            boolean flag = true;
            String s = Long.toBinaryString(number);
            // 자릿수 구하기
            int count=0;
            while( s.length() > Math.pow(2, count)) count++;
            if(s.length()<Math.pow(2,count)-1) {
                flag = false;
                answer[seq] = 0;
            }
            for (int i = 1; i < s.length(); i += 2) {
                if (s.charAt(i) == '0') {
                    answer[seq] = 0;
                    flag = false;
                    break;
                }
            }
            if(flag) answer[seq] = 1;
            seq++;
        }
        return answer;
    }
}

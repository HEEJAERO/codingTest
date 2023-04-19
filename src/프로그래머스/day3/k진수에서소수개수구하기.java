package 프로그래머스.day3;

public class k진수에서소수개수구하기 {
    public static int solution(int n, int k) {
        int answer = 0;
        StringBuilder num = new StringBuilder("");
        while(n>0){
            num.append(n%k);
            n /= k;
        }
        String str = num.reverse().toString();
        String[] numbers = str.split("0");

        for(String number:numbers){
            if(number.equals("")) continue;
            long tmp = Long.parseLong(number);
            if(tmp == 1) continue;

            boolean isPrime = true;
            for(int i=2;i*i<=n;i++){
                if(tmp%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime) answer ++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(437674,10));
    }
}

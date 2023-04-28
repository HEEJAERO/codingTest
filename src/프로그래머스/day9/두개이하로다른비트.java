package 프로그래머스.day9;

public class 두개이하로다른비트 {
    public long[] solution(long[] numbers) {
        long[] answer = new long[numbers.length];
        for(int i=0;i<numbers.length;i++){
            long num = numbers[i];
            if(num%2 == 0) answer[i] = num+1;
            else{
                String s = Long.toBinaryString(num);
                String[] tmp = s.split("0");
                for(String a: tmp) System.out.println(a);
                int a = tmp[tmp.length - 1].length()-1;
                answer[i]  = num + (long)Math.pow(2,a);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        두개이하로다른비트 a = new 두개이하로다른비트();
        for (long b : a.solution(new long[]{2, 0})) {
            System.out.print(b+ " ");
        }
    }
}

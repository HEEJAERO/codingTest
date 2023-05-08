package 프로그래머스.day1_10.day2;

public class n2배열자르기 {
    public static int[] solution(int n, long left, long right) {

        int length = (int)(right-left+1);
        int[] answer = new int[length];
        // 3. 새로운 배열 생성
        for(int i=0;i<length;i++){
            long x = (left+i)/n;
            long y = (left+i)%n;
            answer[i] = (int) (Math.max(x,y))+1;
        }
        return answer;
    }
    public static void main(String[] args) {
        for(int a:solution(3,2,5)){
            System.out.println(a);
        }
    }
}

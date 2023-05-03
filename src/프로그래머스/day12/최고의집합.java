package 프로그래머스.day12;

public class 최고의집합 {
    public int[] solution(int n, int s) {
        //int[] answer = {};
        if(n>s) return new int[]{-1};
        int[] answer = new int[n];

        for(int i=0;i<n;i++) answer[i] = s/n;

        if(s%n != 0){
            int res = s%n;
            for(int i=n-1;i> n-1-res;i--){
                answer[i]+= 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        최고의집합 a = new 최고의집합();
        for(int b: a.solution(2,9)){
            System.out.print(b + " ");
        }
        
    }
}

package 프로그래머스.day11;

public class _124나라의숫자 {
    // 3 진수 변환과 비슷, 나머지가 0,1,2 가 아닌 1,2,3 이기 때문에  로 사용하기 때문에 매 자릿수를 구할때마다 -1 을 해줘야함
    // 예시 - 9 인경우 3*3 이 아닌 3*2 + 3 으로 나타내야 하므로  3*2 +2 로 나타낸 다음 숫자만 변환
    public String solution(int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder("");
        int[] arr = {1, 2, 4};
        while(n>0){
            n--;
            int res = n%3;
            n /= 3;
            sb.append(arr[res]);
        }
        answer = sb.reverse().toString();
        System.out.println(answer);
        return answer;
    }
    public static void main(String[] args) {
        _124나라의숫자 a = new _124나라의숫자();
        System.out.println(a.solution(10));
    }
}

package 프로그래머스.day15;

import java.util.ArrayList;
import java.util.List;

public class 기지국설치 {
    // Level3 Greedy - 인덱스 범위 주의
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        int pos = 1;
        for(int station: stations){
            if(station-w > pos) list.add(station - w - pos);
            pos = station + w+1;
        }
        if(pos <= n) list.add(n - pos + 1);
        int width = 2 * w + 1;
        for(int a: list){
            if(a % width == 0) answer += a / width;
            else answer += (a / width + 1);
        }
        return answer;
    }
    public static void main(String[] args) {
        기지국설치 a = new 기지국설치();
        System.out.println(a.solution(1, new int[]{1}, 1));
    }
}

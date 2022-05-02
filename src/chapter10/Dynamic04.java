package chapter10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick> {
    public int s, h, w;
    Brick(int s, int h, int w) {
        this.s = s;
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Brick o) {
        // 넓이에 대해 내림차순 정
        // 매개변수 - this > 내림차순
        // this - 매개변수 > 오름차순
        return o.s - this.s;
    }
}
public class Dynamic04 {
    public static int Solution(ArrayList<Brick> arr) {
        int answer;
        int[] dy = new int[arr.size()];
        Collections.sort(arr);
        dy[0] = arr.get(0).h;
        answer = dy[0];
        for(int i=1;i<arr.size();i++){
            int max = 0 ;
            for(int j=0;j<i;j++) {
                if (arr.get(j).w > arr.get(i).w && dy[j] > max) max = dy[j];
            }
            max += arr.get(i).h;
            dy[i] = max;
            answer = Math.max(answer, dy[i]);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Brick(sc.nextInt(), sc.nextInt(), sc.nextInt()));
        }
        System.out.println(Solution(arr));
    }

}

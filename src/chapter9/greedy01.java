package chapter9;

import java.util.HashMap;
import java.util.Scanner;
class Body implements Comparable<Body>{
    public int height;
    public int weight;
    Body(int h,int w){
        this.height = h;
        this.weight = w;
    }
    @Override
    public int compareTo(Body T){//키를 기준으로 내림차순 정렬
        return T.height  - this.height;
    }
}
public class greedy01 {
    public static int Solution(){
        int answer = 0;
        HashMap<Integer, String> map = new HashMap<>();
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

    }
}

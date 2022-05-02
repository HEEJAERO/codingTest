package chapter9;

import java.util.ArrayList;
import java.util.Collections;

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
    public static int Solution(ArrayList<Body> arr) {
        int answer = 1;
        Collections.sort(arr);
        int max = arr.get(0).weight;
        for(int i=1;i<arr.size();i++){

            if(arr.get(i).weight >max) {
                answer++;
                max = arr.get(i).weight;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Body> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr.add(new Body(sc.nextInt(), sc.nextInt()));
        }
        System.out.println(Solution(arr));
    }
}

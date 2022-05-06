package chapter9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class T implements Comparable<T> {
    public int value;
    public char state;

    T(int value, char state) {

        this.value = value;
        this.state = state;
    }
    @Override
    public int compareTo(T o) {
        if(this.value == o.value) return this.state - o.state;
        else return this.value - o.value;
    }
}
public class Greedy03 {

    public static int Solution(int n, ArrayList<T> list) {
        int count = 0;
        int answer = 0;
        Collections.sort(list);
        for (T t : list) {
            if (t.state == 'e') {
                count--;
            } else count++;
            answer = Math.max(count, answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<T> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int start = sc.nextInt();
            int end = sc.nextInt();
            list.add(new T(start, 's'));
            list.add(new T(end, 'e'));
        }

        System.out.println(Solution(n,list));
    }
}

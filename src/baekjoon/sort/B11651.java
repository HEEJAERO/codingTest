package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class B11651 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point2[] arr = new Point2[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Point2(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr);
        for (Point2 p : arr) {
            System.out.println(p.x + " " + p.y);
        }
    }
}

class Point2 implements Comparable<Point2>{
    int x;
    int y;

    public Point2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point2 o) {
        if (this.y == o.y) {
            return this.x - o.x;
        }
        return this.y - o.y;
    }
}
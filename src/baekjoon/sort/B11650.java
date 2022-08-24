package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class B11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point[] arr = new Point[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr,(p1,p2)->{
            if (p1.x == p2.x) {
                return p1.y - p2.y;
            }
            return p1.x - p2.x;
        });
        for (Point p : arr) {
            System.out.println(p);
        }

    }
}
class Point {
    int x;
    int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return this.x + " " + this.y;
    }

}

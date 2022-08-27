package baekjoon.sort;

import java.util.Arrays;
import java.util.Scanner;

public class B11650 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Point1[] arr = new Point1[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Point1(sc.nextInt(), sc.nextInt());
        }
        Arrays.sort(arr,(p1,p2)->{
            if (p1.x == p2.x) {
                return p1.y - p2.y;
            }
            return p1.x - p2.x;
        });
        for (Point1 p : arr) {
            System.out.println(p);
        }

    }
}
class Point1 {
    int x;
    int y;
    public Point1(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return this.x + " " + this.y;
    }

}

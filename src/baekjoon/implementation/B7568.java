package baekjoon.implementation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B7568 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Person[] arr = new Person[n];
        for (int i = 0; i < n; i++) {
            arr[i] = new Person(sc.nextInt(), sc.nextInt());
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==j) continue;
                if (arr[i].w > arr[j].w && arr[i].h > arr[j].h) {
                    arr[j].rank++;
                }
            }
        }
        for (Person p : arr) {
            System.out.print(p.rank + " ");
        }
    }
}
class Person {
    int w;
    int h;
    int rank;
    public Person(int w, int h) {
        this.w = w;
        this.h = h;
        this.rank = 1;
    }
}
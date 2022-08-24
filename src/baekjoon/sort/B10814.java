package baekjoon.sort;

import java.util.*;

public class B10814 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Person> people = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            people.add(new Person(sc.nextInt(), sc.next()));
        }
        //people.sort(Comparator.comparingInt(p -> p.age));
        Collections.sort(people);
        for (Person p : people) {
            System.out.println(p);
        }
    }

}
class Person implements Comparable<Person> {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
    @Override
    public String toString() {
        return age + " " + name;
    }
}

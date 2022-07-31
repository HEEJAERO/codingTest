package doit;

import java.util.Scanner;

public class DoIt_09 {
    static char[] dna = {'A','C','G','T'};
    static int[] tmp = {0,0,0,0}; // 한번 체크할때마다 있는 배열 수
    static int[] std = new int[4];
    static int check;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String s = sc.next();
        int answer = 0;
        // 각 문자가 있어야 하는 최소 수
        for(int i=0;i<4;i++){
            std[i] = sc.nextInt();
            if(std[i]==0) check++;
        }
        System.out.println(n+" "+ m+" "+ s + " ");
        for(int i=0;i<m;i++){
            Add(s.charAt(i));
        }
        // 첫번째 DNA 체크
        if (check == 4) {
            answer++;
        }
        for(int i=0;i<n-m;i++){ // 이후 첫번째 문자를 뺴주고 끝문자를 더하며 check
            remove(s.charAt(i));
            Add(s.charAt(i + m ));
            if(check==4) answer++;
        }
        System.out.println(answer);

    }
    public static void Add(char a){
        switch (a){
            case 'A':
                tmp[0]++;
                if(tmp[0] == std[0])
                    check++;
                break;
            case 'C':
                tmp[1]++;
                if(tmp[1] == std[1])
                    check++;
                break;
            case 'G':
                tmp[2]++;
                if(tmp[2] == std[2])
                    check++;
                break;
            case 'T':
                tmp[3]++;
                if(tmp[3] == std[3])
                    check++;
                break;
        }

    }
    public static void remove(char a){
        switch (a){
            case 'A':
                if(tmp[0] == std[0])
                    check--;
                tmp[0]--;
                break;
            case 'C':
                if(tmp[1] == std[1])
                    check--;
                tmp[1]--;
                break;
            case 'G':
                if(tmp[2] == std[2])
                    check--;
                tmp[2]--;
                break;
            case 'T':
                if(tmp[3] == std[3])
                    check--;
                tmp[3]--;
                break;
        }
    }

}
/*
// 내가 푼 오답
import java.util.ArrayList;
        import java.util.List;
        import java.util.Scanner;

public class Main {
    static char[] dna = {'A','C','G','T'};
    static int[] tmp = {0,0,0,0}; // 한번 체크할때마다 있는 배열 수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String s = sc.next();
        int answer = 0;
        int[] std = new int[4]; // 각 문자가 있어야 하는 최소 수

        for(int i=0;i<4;i++){
            std[i] = sc.nextInt();
        }
        for(int i=0;i<m;i++){
            Add(s.charAt(i));
        }
        // 첫번째 DNA 체크
        check(std);
        for(int i=0;i<n-m;i++){ // 이후 첫번째 문자를 뺴주고 끝문자를 더하며 check
            remove(s.charAt(i));
            Add(s.charAt(i + m ));
            boolean check = check(std);
            if(check) answer++;
        }
        System.out.println(answer);

    }
    public static void Add(char a){
        switch (a){
            case 'A': tmp[0]++; break;
            case 'C': tmp[1]++; break;
            case 'G': tmp[2]++; break;
            case 'T': tmp[3]++; break;
        }

    }
    public static void remove(char a){
        switch (a){
            case 'A': tmp[0]--; break;
            case 'C': tmp[1]--; break;
            case 'G': tmp[2]--; break;
            case 'T': tmp[3]--; break;
        }
    }
    public static boolean check(int[] std){
        boolean a = false;
        for(int i=0;i<4;i++){
            if(tmp[i]>=std[i]) a = true;
            else return false;
        }
        return a;
    }
}
*/

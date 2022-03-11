package chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class HashTree_01 {
    public static char Solution(int n, String str){
        char answer=' ';
        HashMap<Character,Integer> hashMap = new HashMap<>();
        /*for(int i =0;i<str.length();i++){
            hashMap.put(str.charAt(i),hashMap.getOrDefault(str.charAt(i),0)+1);
        }*/
        for(char c :str.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c,0)+1);
        }
        int max=Integer.MIN_VALUE;
        for(char key: hashMap.keySet()){
            if(max<hashMap.get(key)) {
                max=hashMap.get(key);
                answer = key;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String input = sc.nextLine();

        System.out.println(Solution(n,input));
    }
}

package inflearn.chapter4;

import java.util.HashMap;
import java.util.Scanner;

public class HashTree_02 {
    public static String Solution1(String str1, String str2){

        HashMap<Character,Integer> hashMap1 = new HashMap<>();
        HashMap<Character,Integer> hashMap2 = new HashMap<>();
        for(char c :str1.toCharArray()){
            hashMap1.put(c, hashMap1.getOrDefault(c,0)+1);
        }
        for(char c :str2.toCharArray()){
            hashMap2.put(c, hashMap2.getOrDefault(c,0)+1);
        }
        if(hashMap1.equals(hashMap2))
            return "YES";
        return "NO";
    }
    public static String Solution2(String str1, String str2) {
        HashMap<Character,Integer> hashMap = new HashMap<>();

        for(char c :str1.toCharArray()){
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        for(char c: str2.toCharArray()){
            if (!hashMap.containsKey(c) || hashMap.get(c) == 0) {
                return "NO";
            }
            hashMap.put(c, hashMap.get(c) - 1);
        }
        //길이가 같다라는 조건이 있으므로, 위의 for 문을 무사히 나오면 무조건 모든 value 가 0이 된다.
        return "YES";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        System.out.println(Solution2(str1,str2));
    }
}

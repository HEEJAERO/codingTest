package 프로그래머스.day1_10.day10;

import java.util.LinkedHashSet;
import java.util.Set;

public class 소수찾기 {
    // Level 2 -  dfs(재귀)
    static boolean[] visited;
    char[] nums;
    static Set<Integer> set = new LinkedHashSet<>();
    static StringBuilder s = new StringBuilder();
    public int solution(String numbers) {

        nums = numbers.toCharArray();
        visited = new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            visited[i] = true;
            dfs(nums[i],0);
            visited[i] = false;
        }
        for(int a: set) System.out.print(a + " ");
        return set.size();
    }
    void dfs(char num, int seq){
       // System.out.println(s);
        s.append(num);
        isPrime(s.toString());
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                visited[i] = true;
                dfs(nums[i], seq + 1);
                visited[i] = false;
            }
        }
        s.deleteCharAt(seq);
    }

    void isPrime(String str){
        int num = Integer.parseInt(str);
        if(num==1 || num==0) return;
        for(int i=2;i<=(int)Math.sqrt(num);i++){
            if(num%i == 0) return;
        }
        set.add(num);
    }

    public static void main(String[] args) {
        소수찾기 a = new 소수찾기();
        System.out.println(a.solution("17"));
    }
}

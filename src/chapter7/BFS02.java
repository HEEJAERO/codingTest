package chapter7;

import java.util.*;

public class BFS02 {
    static int[] ch= new int[10001];
    static int[] dis = {1, -1, 5};
    public static int Solution(int n,int m){
        Queue<Integer> queue = new LinkedList<>();
        ch[n]=1;
        queue.add(n);
        int L = 0;
        while(!queue.isEmpty()){
            int len = queue.size();
            for(int i=0;i<len;i++) {
                int cur = queue.poll();
                for(int j=0;j<3;j++){
                    int nx = cur + dis[j];
                    if(nx == m) return L+1;
                    if(nx>=1 && nx<=10000&&ch[nx]==0){
                        ch[nx]=1;
                        queue.add(nx);
                    }
                }
            }
            L++;
        }
        List<Integer> a = new ArrayList<>();

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(Solution(n,m));
    }
}

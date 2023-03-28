package inflearn.chapter5;

import java.util.*;

public class Stack_08 {
    class People{
        int id;
        int priority;
        public People(int id,int priority){
            this.id = id;
            this.priority = priority;
        }
    }
    public int Solution(int n, int m, int[] arr){
        int answer = 0;

        Queue<People> queue = new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            queue.offer(new People(i,arr[i]));
        }
        while(!queue.isEmpty()){
            People tmp = queue.poll();
            for(People x:queue){
                if(x.priority> tmp.priority){
                    queue.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer ++;
                if(tmp.id == m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack_08 s = new Stack_08();
        int n =  sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(s.Solution(n,m,arr));
    }
}

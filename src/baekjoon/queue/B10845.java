package baekjoon.queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class B10845 {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }

        List<Integer> queue = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] s = arr[i].split(" ");
            if(s[0].equals("push")){
                queue.add(Integer.valueOf(s[1]));
            }else if(s[0].equals("pop")){
                if(queue.isEmpty()){
                    System.out.println(-1);
                }else {
                    System.out.println(queue.remove(0));
                }
            }else if(s[0].equals("size")){
                System.out.println(queue.size());
            }else if(s[0].equals("empty")){
                if(queue.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else if(s[0].equals("front")){
                if (queue.isEmpty()) {
                    System.out.println(-1);;
                }else{
                    System.out.println(queue.get(0));
                }
            } else if (s[0].equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println(-1);
                }else{
                    System.out.println(queue.get(queue.size()-1));
                }
            }
        }
    }
}

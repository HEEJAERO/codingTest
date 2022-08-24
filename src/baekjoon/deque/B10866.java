package baekjoon.deque;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class B10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = br.readLine();
        }
        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            String[] s = arr[i].split(" ");
            if(s[0].equals("push_front")){
                deque.addFirst(s[1]);
            }else if(s[0].equals("push_back")){
                deque.addLast(s[1]);
            } else if(s[0].equals("pop_front")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.removeFirst());
                }
            } else if(s[0].equals("pop_back")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.removeLast());
                }
            }
            else if(s[0].equals("size")){
                System.out.println(deque.size());
            }
            else if(s[0].equals("empty")){
                if(deque.isEmpty()){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }
            else if(s[0].equals("front")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.getFirst());
                }
            }
            else if(s[0].equals("back")){
                if(deque.isEmpty()){
                    System.out.println(-1);
                }else{
                    System.out.println(deque.getLast());
                }
            }

        }
    }
}

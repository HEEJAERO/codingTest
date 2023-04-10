package baekjoon.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class B1697 {
    static boolean[] visited = new boolean[100001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int seq = 0;
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(N, 0));
        Node node;
        while(true){
            seq++;
            node = queue.poll();
            if(visited[node.x]) continue;
            //if(node.x > 100000 || node.x<0) break;
            if (node.x == K) {
                seq = node.seq;
                break;
            }
            visited[node.x] = true;
            if (node.x - 1 >= 0) {
                queue.add(new Node(node.x - 1, node.seq + 1));
            }
            if (node.x * 2 <= 100000) {
                queue.add(new Node(node.x * 2, node.seq + 1));
            }
            if(node.x+1<=100000) {
                queue.add(new Node(node.x + 1, node.seq + 1));
            }

        }
        System.out.println(seq);
    }
    static class Node{
        int x;
        int seq;

        public Node(int x, int seq) {
            this.x = x;
            this.seq = seq;
        }
    }

}

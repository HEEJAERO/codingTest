package 프로그래머스.day14;

import java.util.*;

public class 단어변환 {
    // Level 3 - bfs 이지만, map 을 이용해서 인접 리스트를 작성(하나만 다른 문자열 == 인접해 있음)
    //
    static Map<String, List<String>> near;
    static Map<String,Boolean> visited;
    static int answer;
    public int solution(String begin, String target, String[] words) {
        answer = Integer.MAX_VALUE;
        boolean flag = false;
        int len = words[0].length();
        near = new HashMap<>();
        visited = new HashMap<>();

        near.put(begin, new ArrayList<>());

        for(String word:words) {
            int cnt = 0;
            for(int i=0;i<len;i++){
                if(begin.charAt(i) != word.charAt(i)) cnt++; // 몇 글자가 다른가 체크
            }
            visited.put(word, false);
            near.put(word, new ArrayList<>());
            if(cnt==1) near.get(begin).add(word);
            if(word.equals(target)) flag = true; // flag == false 라면 target 값이 존재하지 않음
            for(String w:words){
                if(word.equals(w)) continue; // 같은 경우 패스
                int count = 0;
                for(int i=0;i<len;i++){
                    if(word.charAt(i) != w.charAt(i)) count++;
                }
                if(count == 1){
                    near.get(word).add(w);
                }
            }
        }
//        for(String s: near.get(begin)) System.out.print(s+" ");
//        System.out.println();
        visited.put(begin, true);
        bfs(begin,target);
        if(!flag) return 0;

        return answer;
    }
    void bfs(String start,String target){

        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, start));
        while(!queue.isEmpty()){
            Point p = queue.poll();
            String s = p.s;
            //System.out.println(s);
            int seq = p.seq;
            if(s.equals(target)) {
                answer = seq;
                break;
            }
            for(String tmp: near.get(s)){
                if(!visited.get(tmp)){
                    visited.put(tmp, true);
                    queue.add(new Point(seq+1,tmp)); // 방문하면서 이전
                }
            }
        }
    }
    class Point{
        int seq;
        String s;

        public Point(int seq, String s) {
            this.seq = seq;
            this.s = s;
        }
    }
    public static void main(String[] args) {
        단어변환 a = new 단어변환();
        System.out.println(a.solution("hit", "cog", new String[]{"hot", "dot", "dog", "lot", "log", "cog"}));
    }
}

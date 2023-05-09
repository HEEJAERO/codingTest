package 프로그래머스.day15;

import java.util.*;

public class 베스트앨범 {
    // Level 3
    // pq 를 iterator 로 순회하면 순서가 보장되지 않음
    // 코드가 너무 지저분함 나중에 더 좋은 알고리즘이 생각나면 수정
    public int[] solution(String[] genres, int[] plays) {
        int[] answer;
        PriorityQueue<Album> pqAlbum = new PriorityQueue<>(); // 앨범용 pq
        PriorityQueue<Genre> pqGenre = new PriorityQueue<>();
        Map<String, Integer> playPerGenre = new HashMap<>(); // 장르별 플레이
        Map<String, Queue<Integer>> perGenre = new HashMap<>();
        int len = genres.length;
        for(int i=0;i<len;i++){
            playPerGenre.put(genres[i], playPerGenre.getOrDefault(genres[i], 0) + plays[i]); // 장르별 플레이 횟수 저장
            pqAlbum.add(new Album(plays[i],i, genres[i]));
        }

        for(String s:playPerGenre.keySet()){
            pqGenre.add(new Genre(playPerGenre.get(s), s));
            perGenre.put(s, new LinkedList<>());
        }
        //System.out.println(perGenre.size());
        for(int i=0;i<len;i++){
            Album a = pqAlbum.poll();
            String genre = a.genre;
            int seq = a.seq;
            perGenre.get(genre).add(seq);
            //System.out.println(seq+ " " + genre);
        }
        //answer = new int[playPerGenre.size()*2];
        int seq = 0;
        List<Integer> list = new ArrayList<>();
        while(!pqGenre.isEmpty()){
            Genre genre = pqGenre.poll();
            String s = genre.genre;

            for(int i=0;i<2;i++){
                if(!perGenre.get(s).isEmpty()){
                    list.add(perGenre.get(s).poll());
                }
               // System.out.println(s + answer[seq-1]);
            }
        }
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }
    class Album implements Comparable<Album>{
        int play;
        int seq;
        String genre;

        public Album(int play, int seq, String genre) {
            this.play = play;
            this.seq = seq;
            this.genre = genre;
        }

        @Override
        public int compareTo(Album o) {
            return o.play - this.play;
        }
    }
    class Genre implements Comparable<Genre>{
        int play;
        String genre;

        public Genre(int play, String genre) {
            this.play = play;
            this.genre = genre;
        }
        @Override
        public int compareTo(Genre o) {
            return o.play - this.play;
        }
    }
    public static void main(String[] args) {
        베스트앨범 a = new 베스트앨범();
        for (int b : a.solution(new String[]{"classic", "pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500})) {
            System.out.println(b);
        }
    }
}

package 프로그래머스.day1_10.day3;

public class 피로드 {
    static int count=0;
    public static int solution(int k, int[][] dungeons) {
        int answer = -1;
        boolean[] visited ;
        for(int i=0;i<dungeons.length;i++){
            visited = new boolean[dungeons.length];
            if(dungeons[i][0]<=k){
                visited[i] = true;
                //System.out.println(i + "실행됨");
                search(1,visited,dungeons,k-dungeons[i][1]);
            }

        }
        answer = count;
        return answer;
    }
    public static void search(int depth, boolean[] visited,int[][] dungeons,int k){
        // 종료 조건
        // 1.남은 피로도가 최소 입장조건을 만족하는 경우가 없을경우
        // 2. 모두 다 방문했을 경우
        // 이 경우 depth 를 count 에 넣어줌
        boolean flag=false;
        for(int i=0;i<dungeons.length;i++){
            if(!visited[i] && dungeons[i][0]<=k){
                flag = true;
                visited[i] = true;
                search(depth+1,visited,dungeons,k-dungeons[i][1]);
                visited[i] = false;
            }
        }
        if(!flag) {
            //System.out.println(depth);
            count = Math.max(count,depth);
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(80, new int[][]{{80, 20}, {50, 40}, {30, 10}}));
    }
}

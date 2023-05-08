package 프로그래머스.day13;

public class 네트워크 {
    boolean[] visited;
    public int solution(int n, int[][] computers) {
        int answer = 0;
        visited = new boolean[n];
        for(int i=0;i<n;i++){
            if(!visited[i]){
                answer ++;
                visited[i] = true;
                dfs(i,computers);
            }
        }
        return answer;
    }
    void dfs(int n, int[][] computers){
        int len = computers[n].length;
        for(int i=0;i<len;i++){
            if(computers[n][i] == 1 && !visited[i]){
                visited[i] = true;
                dfs(i,computers);
            }
        }
    }

    public static void main(String[] args) {
        네트워크 a = new 네트워크();
        System.out.println(a.solution(3,new int[][]{{1, 1, 0}, {1, 1, 0}, {0, 0, 1}}));
    }
}

package 프로그래머스.day2;

public class 공원산책 {
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};
        int y = park.length;
        int x = park[0].length();
        int cur_x = 0;
        int cur_y = 0;
        char[][] arr = new char[y][x];
        for(int i=0;i<park.length;i++){
            arr[i] = park[i].toCharArray();
            for(int j=0;j<park[0].length();j++){
                if(arr[i][j]=='S'){
                    cur_y = i;
                    cur_x = j;
                }
            }
        }
        for(String route: routes){
            String[] tmp = route.split(" ");
            char op = tmp[0].charAt(0);
            int n = Integer.parseInt(tmp[1]);
            boolean flag = true;
            if(op=='S' && cur_y+n<y){
                for(int i=1;i<=n;i++){
                    if(arr[cur_y+i][cur_x]=='X'){
                        flag=false;
                    }
                }
                if(flag){
                    cur_y += n;
                }
            }else if(op=='N' && cur_y-n>=0){
                for(int i=1;i<=n;i++){
                    if(arr[cur_y+i][cur_x]=='X'){
                        flag=false;
                    }
                }
                if(flag){
                    cur_y += n;
                }

            }else if(op == 'W' && cur_x-n >=0){
                for(int i=1;i<=n;i++){
                    if(arr[cur_y][cur_x+i]=='X'){
                        flag=false;
                    }
                }
                if(flag){
                    cur_x += n;
                }
            }else if(op == 'E' && cur_x+n <x){
                for(int i=1;i<=n;i++){
                    if(arr[cur_y][cur_x+i]=='X'){
                        flag=false;
                    }
                }
                if(flag){
                    cur_x += n;
                }
            }
        }

        return new int[]{cur_x,cur_y};
    }
    public static void main(String[] args) {
        for(int a:solution(new String[]{"SOO","OOO","OOO"},new String[] {"E 2","S 2","W 1"})){
            System.out.println(a);
        }
    }
}

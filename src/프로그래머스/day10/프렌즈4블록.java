package 프로그래머스.day10;

import java.util.ArrayList;
import java.util.List;

public class 프렌즈4블록 {
    // Level 2, arr 를 List 로 옮겨서 반복하며 pop, List 로 옮길때 순서를 주의
    public static int solution(int m, int n, String[] board) {
        int answer = 0;
        List<List<Character>> list = new ArrayList<>();
        List<List<Boolean>> pop = new ArrayList<>();
        for (int i = 0; i < board[0].length(); i++) {
            list.add(new ArrayList<>());
            pop.add(new ArrayList<>());
        }
        for(int i= board.length-1;i>=0;i--){
            for(int j=0;j<board[i].length();j++){
                list.get(j).add(board[i].charAt(j));
                pop.get(j).add(false);
            }
        }
        boolean flag = true;
        int seq = 1;
        while(flag){
            flag = false;
            for (int i = 0; i < list.size()-1; i++) {
                for(int j=0;j<list.get(i).size()-1;j++){
                    if( list.get(i+1).size() > j+1){ // j+1 보다 더 큰 리스트를 보유해야만 pop 을 하기위한 연산이 가능
                        char com = list.get(i).get(j);
                        if(com == list.get(i).get(j+1) && com == list.get(i+1).get(j) && com == list.get(i+1).get(j+1)){
                            flag = true;
                            pop.get(i).set(j, true);
                            pop.get(i + 1).set(j, true);
                            pop.get(i).set(j + 1, true);
                            pop.get(i + 1).set(j + 1, true);
                            // 일단 위치를 다 찾아놓은 다음에 연산을 해야 겹치는 부분도 찾을 수 있음
                        }
                    }
                }
            }
            for (int i = 0; i < list.size(); i++) {
                for (int j = 0; j < list.get(i).size(); j++) {
                    if(pop.get(i).get(j)){
                       // System.out.println(seq + " "+ i +" " + j);
                        pop.get(i).remove(j);
                        list.get(i).remove(j);
                        answer ++;
                        j--;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(6, 6, new String[]{"CCBDE", "AAADE", "AAABF", "CCBBF"}));

    }
}

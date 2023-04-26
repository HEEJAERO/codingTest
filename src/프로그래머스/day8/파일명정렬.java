package 프로그래머스.day8;

import java.util.ArrayList;
import java.util.List;

public class 파일명정렬 {
    // Level 2
    // Pattern 이라는 정규 표현식을 쓸 수 있는 클래스를 쓴다면 더 편리하게 해결가능할듯
    // Pattern 에 대해 알아봐야겠다
    public String[] solution(String[] files) {

        String[] answer;
        List<Dict> list = new ArrayList<>();
        for(String file: files){ // 처음에 숫자를 찾는 과정
            int start = 0;
            int count = 0;
            for(int i=0;i<file.length();i++){
                if(file.charAt(i) >= '0' && file.charAt(i)<='9'){
                    start = i;
                    while( i<file.length() &&file.charAt(i) >= '0' && file.charAt(i)<='9'){
                        count++;
                        i++;
                    }
                    break;
                }

            }
            //System.out.println(file.substring(0,start) + " " + file.substring(start,start+count) + " " + file.substring(start+count));
            System.out.println(start + " " + count);
            list.add(new Dict(file.substring(0, start), file.substring(start, start + count), file.substring(start + count)));
        }
        list.sort((o1, o2) -> {
            if(o1.head.equalsIgnoreCase(o2.head)) return Integer.parseInt(o1.number) - Integer.parseInt(o2.number);
            return o1.head.toUpperCase().compareTo(o2.head.toUpperCase());
        });
        answer = new String[list.size()];
        for(int i=0;i<list.size();i++){
            answer[i] = list.get(i).combine();
        }

        return answer;
    }
    class Dict{
        String head;
        String number;
        String tail;

        public Dict(String head, String number, String tail) {
            this.head = head;
            this.number = number;
            this.tail = tail;
        }
        public String combine(){
            return head+number+tail;
        }
    }
    public static void main(String[] args) {
        파일명정렬 a = new 파일명정렬();
        for(String s: a.solution(new String[]{"img12.png","A0", "foo010bar020.zip", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"})){
            System.out.println(s);
        }

    }
}

public class 괄호변환 {
    public static void main(String[] args) {
        // 프로그래머스 괄호변환
        String s = "[[7], [3, 8], [8, 1, 0], [2, 7, 4, 4], [4, 5, 2, 6, 5]]";
        s = s.replaceAll("\\[","\\{").replaceAll("\\]","\\}");
        System.out.println(s);
    }
}

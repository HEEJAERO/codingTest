public class 괄호변환 {
    public static void main(String[] args) {
        // 프로그래머스 괄호변환
        String s = "[[-20,-15], [-14,-5], [-18,-13], [-5,-3]]";

        s = s.replaceAll("\\[","\\{").replaceAll("\\]","\\}");
        System.out.println(s);
    }
}

package codingInterview.chapter4;

public class p4_1 {
    // parity bit
    public static int solution1(long x){
        int result = 0;
        while(x != 0){
            result ^= (x&1); // & -> 두 수 모두 1 일때만
            System.out.println(result);
            x >>>= 1;
            //System.out.println(x);
        }
        return result;
    }
    public static int solution2(long x){
        int result =0;
        while(x!=0){
            result ^= 1;
            x &= (x-1);
        }
        return result;
    }
    public static int solution3(long x){
        int result = 0;
        final int WORD_SIZE = 16;
        final int BIT_MASK = 0xFFFF;

        return result;

    }

    public static void main(String[] args) {
        //System.out.println(solution1(7));
        System.out.println(solution2(7));


    }
}

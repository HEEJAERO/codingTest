package kakao;

public class q2 {

    public static void main(String[] args) {
        System.out.println(solution(4, 5, new int[]{1, 0, 3, 1, 2}, new int[]{0, 3, 0, 4, 0}));
    }

    public static long solution(int cap, int n, int[] deliveries, int[] pickups) {
        int tmp_delivery = 0;
        int tmp_pickup = 0;
        int final_delivery = 0;
        int final_pickup = 0;
        int go = 0;
        int back = 0;
        boolean flag_delivery = false;
        boolean flag_pickup = false;
        for (int i = n-1; i >= 0; i--) {

            if (deliveries[i] != 0 && flag_delivery ) {
                final_delivery = i;
                flag_delivery = false;
            }
            if (pickups[i] != 0 && flag_pickup) {
                final_pickup = i;
                flag_pickup = false;
            }
            tmp_delivery += deliveries[i];
            while (tmp_delivery >= cap) {
                System.out.println("!!");
                tmp_delivery -= cap;
                go += 2* (i + 1);
                flag_delivery = true;
            }
            tmp_pickup += pickups[i];
            while (tmp_pickup >= cap) {
                System.out.println("!!!");
                tmp_pickup -= cap;
                back += 2 * (i + 1);
                flag_pickup = true;
            }
        }
        while(tmp_delivery>0){
            System.out.println("!!" + final_delivery);
            tmp_delivery -= cap;
            go += 2 * (final_delivery + 1);
        }
        while (tmp_pickup > 0){
            System.out.println("!!!" + final_pickup);
            tmp_pickup -= cap;
            back += 2 * (final_pickup + 1);
        }

        if(go>=back) return go;
        else return back;
    }
}

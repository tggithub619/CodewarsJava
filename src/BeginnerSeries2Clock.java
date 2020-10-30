public class BeginnerSeries2Clock {

    public static int Past(int h, int m, int s)     {

        int res;

        res = (h *3600 + m * 60 +s) *1000;

        return res;
    }

    public static void main(String[] args) {
        System.out.println(Past(0,1,1));
    }



}

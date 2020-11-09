public class If_you_cant_sleep_just_count_sheep {

    //https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/solutions/java/me/best_practice

    public static String countingSheep(int n) {
        String res = "";
        for (int i=1; i <= n; i++){
            res += i + " sheep...";
        }
        return res;
    }
}

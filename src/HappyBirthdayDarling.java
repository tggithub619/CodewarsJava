public class HappyBirthdayDarling {

    //https://www.codewars.com/kata/5e96332d18ac870032eb735f/solutions/java/me/best_practice

    public static String womensAge(int n) {
        return n + "? That's just " + (20 + n % 2) + ", in base " + n / 2 + "!";
    }

    public static void main(String[] args) {
        System.out.println(womensAge(32));
    }

}

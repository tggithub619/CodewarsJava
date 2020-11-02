public class String_repeat {

    public static String repeatStr(final int repeat, final String string) {
        String res = "";
        for (int i = 0; i <repeat; i++) {
            res += string;

        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
    }

}

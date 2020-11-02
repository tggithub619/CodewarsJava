public class String_repeat {

//https://www.codewars.com/kata/57a0e5c372292dd76d000d7e/solutions/java

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

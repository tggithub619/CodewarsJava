public class Fibonacci {

    //https://www.codewars.com/kata/57a1d5ef7cb1f3db590002af/train/java

    public static long fib (int n){

        long a = 0;
        long b = 1, temp;

        for (int i = 0; i < n; i++) {
            temp = b;
            b = a + b;
            a = temp;
        }
        return a;

    }
}

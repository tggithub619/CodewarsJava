public class NumberofDecimalDigits {

    public static int Digits(long n) {
        if (n < 10) {
            return 1;
        }
        int count = 0;
        long last;
        while (n != 0){
            last = n % 10;
            n = (n-last)/10;
            count++;
        }
        return count;

    }

//    public static int Digits(long n) {
//        return Long.toString(n).length();
//    }

    public static void main(String[] args) {
        System.out.println(Digits(5l));
        System.out.println(Digits(12345l));
    }
}

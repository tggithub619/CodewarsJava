public class FormattingDecimalPlaces1 {

    //https://www.codewars.com/kata/5641c3f809bf31f008000042/train/java

//    public static double twoDecimalPlaces(double n)  {
//        if (n > 0) {
//            return Math.floor(n * 100) / 100;
//        }
//        return Math.ceil(n * 100) / 100;
//    }

//    public static double twoDecimalPlaces(double number)
//    {
//        //Write your code here
//        return (long)(number * 100) / 100.;
//    }

    public static double twoDecimalPlaces(double number) {
        String[] arr = String.valueOf(number).split("\\.");
        return Double.valueOf(arr[0] + "." + arr[1].substring(0, 2));
    }


    public static void main(String[] args) {
        System.out.println( twoDecimalPlaces(10.1289767789));
        System.out.println( twoDecimalPlaces(-7488.83485834983));
    }

}

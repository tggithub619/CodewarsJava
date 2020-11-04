public class FormattingDecimalPlaces0 {

    //https://www.codewars.com/kata/5641a03210e973055a00000d/train/java

    public static double TwoDecimalPlaces(double number)  {

        return(double) Math.round(number * 100)/100.f;
    }
}

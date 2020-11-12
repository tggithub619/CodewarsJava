public class CalculateBMI {

    //https://www.codewars.com/kata/57a429e253ba3381850000fb/train/java

    public static String bmi(double weight, double height) {
        double  c = weight / Math.pow(height, 2);
        if (c <= 18.5) {
            return  "Underweight";}
        if (c <= 25.0) {
            return  "Normal";}
        if (c <= 30.0) {
            return  "Overweight";}
        else {
            return  "Obese";}

    }
}

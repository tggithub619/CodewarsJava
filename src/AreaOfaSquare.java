public class AreaOfaSquare {

    //https://www.codewars.com/kata/5748838ce2fab90b86001b1a/train/java

    public static double squareArea(double A){

        double r;
        double s;

        r = ((4 * A) / Math.PI) / 2;
        s = Math.pow(r, 2);

        return (double) Math.round(s*100)/100.f;
    }

}

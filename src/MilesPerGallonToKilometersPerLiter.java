public class MilesPerGallonToKilometersPerLiter {

    //https://www.codewars.com/kata/557b5e0bddf29d861400005d/train/java

    public static float mpgToKPM(final float mpg) {

        double coefficient = 1.609344 / 4.54609188;
        float c = (float) coefficient;

        return Math.round(mpg * c * 100) / (float) 100;
    }
}

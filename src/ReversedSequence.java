public class ReversedSequence {

    //https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java

    public static int[] reverse(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = n - i;
        }
        return result;
    }

}

public class BreakingChocolateProblem {

    //codewars.com/kata/534ea96ebb17181947000ada/train/java

    public static int breakChocolate(int n, int m) {
        if(n == 0 || m == 0) return 0;
        return n*m - 1;
    }

}

public class Sum_of_positive {

    //https://www.codewars.com/kata/5715eaedb436cf5606000381/solutions/java

    public class Positive{
        public static int sum(int[] arr){
            return Arrays.stream(arr).filter(v -> v > 0).sum();
        }
    }



}

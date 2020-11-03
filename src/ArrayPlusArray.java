public class ArrayPlusArray {

//https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int sum =  0;

        for ( int i : arr1){
            sum = sum +i;
        }
        for (int i : arr2){
            sum = sum +i;
        }
        return sum;
    }


}

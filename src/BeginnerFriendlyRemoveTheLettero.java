public class BeginnerFriendlyRemoveTheLettero {

    //https://www.codewars.com/kata/58d3dd53b0fe8c9ac10000b3/train/java

    public static String removeO(String string) {
        String res = "";
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == 'o'){
                res += "";
            } else {
                res += string.charAt(i);
            }
        }
        return res;
    }
}

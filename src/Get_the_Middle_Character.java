public class Get_the_Middle_Character {

    //https://www.codewars.com/kata/56747fd5cb988479af000028/train/java

    public static String getMiddle(String word) {
        if (word.length() % 2 == 0){
            return word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
        }
        else  {
            return word.substring((word.length() / 2), (word.length() / 2) + 1);
        }

    }
}

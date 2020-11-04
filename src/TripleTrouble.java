public class TripleTrouble {

    //https://www.codewars.com/kata/5704aea738428f4d30000914/train/java

    public static String tripleTrouble(String one, String two, String three) {
        String str = "";
        for ( int i =0; i< one.length(); i++){
            str += one.charAt(i);
            str+= two.charAt(i);
            str += three.charAt(i);
        }
        return str;
    }


}

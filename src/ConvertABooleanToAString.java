public class ConvertABooleanToAString {

    //https://www.codewars.com/kata/551b4501ac0447318f0009cd/train/java

    public static String convert(boolean b){
        if( b == true) {
            return "true";
        } else {
            return "false";
        }
    }

//    public static String convert(boolean b){
//        return b ? "true" : "false";
//    }

//    public static String convert(boolean b){
//        return Boolean.toString(b);
//    }


}

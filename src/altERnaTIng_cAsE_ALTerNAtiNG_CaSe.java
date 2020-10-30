//public class altERnaTIng_cAsE_ALTerNAtiNG_CaSe {
//
//    //https://www.codewars.com/kata/56efc695740d30f963000557/solutions/java
//    //test
//
//    public class StringUtils {
//        public static String toAlternativeString(String string) {
//            String result = "";
//            for (char c : string.toCharArray()) {
//                if(Character.isUpperCase(c)) {
//                    result += Character.toLowerCase(c);
//                } else {
//                    result += Character.toUpperCase(c);
//                }
//            }
//            return result;
//        }
//    }
//
//}
//
//public class StringUtils {
//
//    public static String toAlternativeString(String string) {
//        char[] chars = string.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            chars[i]  = Character.isUpperCase(chars[i]) ? Character.toLowerCase(chars[i]) : Character.toUpperCase(chars[i]);
//        }
//        return new String(chars);
//    }
//}

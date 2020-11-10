public class ExesAndOhs {

    //https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

    public static boolean getXO (String str) {

        str = str.toLowerCase();
        if (!str.contains("x") && !str.contains("o")){
            return true;
        }

        int x = 0;
        int o = 0;

        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) == 'o'){
                o++;
            }
            else {
                x++;
            }
        }
        return o == x;
    }
}

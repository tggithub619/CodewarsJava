public class Are_You_Playing_Banjo {

    public static String areYouPlayingBanjo(String name) {
        String result;

        //if (Character.toLowerCase(name.charAt(0)) == 'r')
        if (name.toLowerCase(). charAt(0) == 'r'){
            result = name + " plays banjo";
        } else {
            result =  name + " does not play banjo";
        }

        return result;
    }


    public static void main(String[] args) {

        System.out.println(  areYouPlayingBanjo("Martin"));
        System.out.println( areYouPlayingBanjo("Ron"));
    }
}

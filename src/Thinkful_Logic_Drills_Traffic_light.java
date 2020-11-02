public class Thinkful_Logic_Drills_Traffic_light {

    public static String updateLight(String current) {
        if ( current.equals("red")){
            return "green";
        } else if  (current.equals("green")){
            return "yellow";
        }

        return "red";
    }

    public static void main(String[] args) {
        System.out.println(updateLight("red"));
        System.out.println(updateLight("green"));
        System.out.println(updateLight("yellow"));
    }

}

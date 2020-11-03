public class CenturyFromYear {

    public static int century(int number) {
        return ((number-1)/100) + 1;
    }

    public static void main(String[] args) {
        System.out.println(century(1705));
    }
}

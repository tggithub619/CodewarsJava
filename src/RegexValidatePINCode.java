public class RegexValidatePINCode {

    //

    public static boolean validatePin(String pin) {
        for (int i = 0; i <= pin.length(); i++){
            if(pin.charAt(i) <= '9'){
                return true;
            } else {
                return false;
            }
        }
        if (pin.length() == 4 || pin.length() == 6){
            return true;
        }
        return false;
    }

    // public static boolean validatePin(String pin) {
    //
    //   return (pin.chars().allMatch(Character::isDigit)) && (pin.length() == 4 || pin.length() == 6);
    //  }

    public static void main(String[] args) {
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("098765"));
        System.out.println(validatePin("a234"));
        System.out.println(validatePin(".234"));
    }


}

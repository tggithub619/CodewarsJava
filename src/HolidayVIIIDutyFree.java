public class HolidayVIIIDutyFree {

    //https://www.codewars.com/kata/57e92e91b63b6cbac20001e5/train/java

    public static int dutyFree(int normPrice, int discount, int hol) {

        return (int) (hol/((double)normPrice * discount /100));

    }
}

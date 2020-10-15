public class Is_It_a_number {

    public boolean isDigit(String s)
    {

        if (s == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

}

//https://www.codewars.com/kata/57126304cdbf63c6770012bd/solutions/java

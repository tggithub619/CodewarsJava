public class Beginner_Series_4_Cockroach {

    //https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/solutions/java

    public class Cockroach{
        public int cockroachSpeed(double kph){
            int secondsInHour = 3600;
            int cmInKm = 100000;
            int centimetresPerSecond = (int) (kph * cmInKm / secondsInHour);
            return centimetresPerSecond;
        }
    }
}

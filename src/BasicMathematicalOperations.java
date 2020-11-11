public class BasicMathematicalOperations {

    //https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java

    public static Integer basicMath(String op, int v1, int v2)  {
        if (op.equals("+")) return v1 + v2;
        if (op.equals("-")) return v1 - v2;
        if (op.equals("*")) return v1 * v2;
        if (op.equals("/")) return v1 / v2;
        else return 0;


    }

//    public static Integer basicMath(String op, int v1, int v2) {
//        switch(op) {
//            case "+" : return v1 + v2;
//            case "-" : return v1 - v2;
//            case "*" : return v1 * v2;
//            case "/" : {
//                if(v2 != 0) return v1 / v2;
//            }
//        }
//
//        return 0;
//    }
}

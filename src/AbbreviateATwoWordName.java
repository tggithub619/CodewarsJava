public class AbbreviateATwoWordName {

    //https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

    public static String abbrevName(String name) {
        String[] names = name.split(" ");
        return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();

    }

//    public static String abbrevName(String name) {
//
//        name = name.toUpperCase();
//        char fio = name.charAt(0);
//        int space = name.indexOf(" ");
//        char next = name.charAt(space + 1);
//        return fio +  "." + next;
//        //String name = new name;
//
//        //int post = name.IndexOf(' ')+1;
//        //return (name.substring(0,1) + name.substring(post,post+1));
//    }

}

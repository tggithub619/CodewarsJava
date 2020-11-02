public class A_wolf_in_sheeps_clothing {

    public static String warnTheSheep(String[] array){
        for (int i = 0; i < array.length - 1; i++){
            if (array[i].equals("wolf")){
                return "Oi! Sheep number " + (array.length - i - 1) +"! You are about to be eaten by a wolf!";
            }
        }
        return "Pls go away and stop eating my sheep";
    }




    public static void main(String[] args) {
        String[] test = new String[]{"sheep", "sheep", "sheep", "sheep", "sheep", "wolf", "sheep", "sheep"};
        System.out.println(warnTheSheep(test));

    }
}

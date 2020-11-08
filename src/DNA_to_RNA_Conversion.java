public class DNA_to_RNA_Conversion {

    //https://www.codewars.com/kata/5556282156230d0e5e000089/train/java

    public String dnaToRna(String dna) {
        String res = "";
        for(int i =0; i<dna.length(); i++) {
            if(dna.charAt(i) == 'T') {
                res +="U";
            }else{
                res += dna.charAt(i);
            }
        }
        return res;  // Do your magic!
    }
}

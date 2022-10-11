package Reps;

public class rel118 {

    String spaceOut(String word1, String word2){
        StringBuilder result1=new StringBuilder();
        for(int i=0; i<word1.length();i++){
            if (i>0){
                result1.append(" ");
            }
            result1.append(word1.charAt(i));}
        System.out.println(result1.toString()+" ");
StringBuilder result2=new StringBuilder();
        for(int i=0; i<word2.length();i++){
            if (i>0){
                result2.append(" ");
            }
            result2.append(word2.charAt(i));}
        System.out.println(result2.toString());;
   return ((word1)+" "+(word2));

}
    public static void main(String[] args) {
        rel118 main=new rel118();
   String newwords=main.spaceOut("hello","technology");





}
}
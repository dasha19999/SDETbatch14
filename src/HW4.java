public class HW4 {
    public static void main(String[] args) {
String word="Kate";
String revers="";
for(int i=word.length()-1;i>=0;i--){
    revers+=word.charAt(i);
}
if(word.equalsIgnoreCase(revers)){
    System.out.println("True");
}else{
    System.out.println("False");
}
    }
}

public class repl119 {

String sencorLetters(String w1, char c1){
String str=w1.replaceAll(w1.valueOf(c1),"*");

   return str;



}

    public static void main(String[] args) {
        repl119 main=new repl119();
        String sensor= main.sencorLetters("welcome wawa",'w');


        String sensor1= main.sencorLetters("trick or treat",'t');
        System.out.println(sensor);
        System.out.println(sensor1);
    }
}

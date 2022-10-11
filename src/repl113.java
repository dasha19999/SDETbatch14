public class repl113 {

    String type (int minutes, int hours){

        return ( (minutes)+":"+(hours));
    }

    public static void main(String[] args) {
        repl113 main=new repl113();
       String time=main.type(11,30);
        System.out.println(time);
    }
}

public class repl129 {
    static String countryname;
    static String continent;
void printInfo(){
    System.out.println(countryname+ " located on "+continent+" continent" );
}

    public static void main(String[] args) {
        continent="Africa";
        countryname="Morocco";
        repl129 repl=new repl129();
        repl.printInfo();
    }

}

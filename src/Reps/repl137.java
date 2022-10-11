package Reps;

public class repl137 {

    public static String name;
    private static String city;

    protected String nameOfSchool="Syntax";
    static int batchnum;

    void printInfo(){
        System.out.println("My name is "+name+" and I live in "+city+"."+" I study at "+ nameOfSchool+" in batch "+batchnum);
    }

    public static void main(String[] args) {
        name="Kate";
        city="NY";

        batchnum=9;
        repl137 main=new repl137();
        main.printInfo();
    }
}

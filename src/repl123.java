public class repl123 {

    int count;
    String name;
    double price;
    boolean ifwalk;
    float size;

    void printInfo(){
        System.out.println(name);
        System.out.println(price);
        System.out.println(ifwalk);
        System.out.println(size);
    }

    public static void main(String[] args) {
        repl123 main=new repl123();
        main.printInfo();
    }


}

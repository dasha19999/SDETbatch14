package Class13;

public class MethodsDemo1 {

    void printHello(){
        System.out.println("Hello World");
        System.out.println("Hello Java");
        System.out.println("Hello Alladin");
    }
    void printWord(String word){
        System.out.println(word);
    }

    public static void main(String[] args) {
        MethodsDemo1 obj=new MethodsDemo1();
        obj.printHello();
        obj.printWord("Taivion Don't worry its Java");
        obj.printWord("No nndndndndndndndnd");
    }
}

package Reps;

public class repl136 {

    private void method1(){
        System.out.println("This is Private Method");
    }
    void method2(){
        System.out.println("This is Default Method");
    }
    protected void method3(){
        System.out.println("This is Protected Method");
    }
    public void method4(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        repl136 main=new repl136();
        main.method1();
        main.method2();
        main.method3();
        main.method4();
        String word ="abrakadabra";

        String replace=word.replaceAll("[^aAeEiIoOuU]", "");

        System.out.println(replace);

    }
}

package Reps;

public class repl138 {
     void method1(){
        System.out.println("default");
    }
protected void method2(){
    System.out.println("protected");
}
private void method3(){
    System.out.println("private"+" ");
}

    public static void main(String[] args) {
        repl138 main=new repl138();
        main.method1();
        main.method2();
        main.method3();
    }
}

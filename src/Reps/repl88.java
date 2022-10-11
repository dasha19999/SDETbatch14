package Reps;

public class repl88 {
    String breed;
    String name;
    String color;

    void bark() {
        System.out.println("can bark");
    }

    void play() {
        System.out.println("can play");
    }

    void run() {
        System.out.println("can run");
    }

    public static void main(String[] args) {
repl88 Husky=new repl88();

        System.out.print("Husky ");Husky.bark();
        System.out.print("Husky ");Husky.run();
        System.out.print("Husky ");Husky.play();

        repl88 Bulldog=new repl88();

        System.out.println("Bulldog "); Bulldog.bark();
        System.out.println("Bulldog "); Bulldog.run();
        System.out.println("Bulldog ");Bulldog.play();

        repl88 Labrador=new repl88();
        System.out.println("Labrador "); Labrador.bark();
        System.out.println("Labrador "); Labrador.run();
        System.out.println("Labrador ");Labrador.play();

    }
}
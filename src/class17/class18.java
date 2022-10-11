package class17;

public class class18 {

    String name;
    String color;
    int age;
    double weight;
    class18 (String name, String color, int age, double weight){
        this.name=name;
        this.age=age;
        this.weight=weight;
        this.color=color;}

    void printInfo(){
        System.out.println("Name "+name+ "color "+color+" Age "+age+" Weight "+ weight);
    }
}
class Parrot extends class18{
    Parrot (String name, String color, int age, double weight){
        super(name, color, age, weight);
    }
       // this.name=name;

}
class Crow extends class18{
    boolean isClever;
    Crow(String name, String color, int age, double weight){
        super(name, color, age, weight);
        this.isClever=isClever;
    }
    }
        //this.name=name;
       // this.age=age;
        //this.weight=weight;
       // this.color=color;

class Test{
    public static void main(String[] args) {
        Parrot parrot=new Parrot("Ylka","green",2,4);
        parrot.printInfo();
    }
}
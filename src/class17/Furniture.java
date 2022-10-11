package class17;

public class Furniture {
    String color="green";
}

class Chair extends Furniture{
    String color="Red";
    void printColor(){
        String color="Black";
        System.out.println(color);//prints local variable
        System.out.println(this.color);// print instance
        System.out.println(super.color);//print from parent
    }
}
class Testchair{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}

package class17;

public class Dog extends Animal {


    public Dog(String name, String breed, String color){
        super(name, breed, color);
    }

}
class cat01 extends Animal {

    cat01(String name, String breed, String color){
      super(name,breed,color);
    }
}

class TestAnimals{
    public static void main(String[] args) {
    Dog dog=new Dog("bobik","grey","green");
    dog.printInfo1();
}
}
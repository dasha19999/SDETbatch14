package class17;

public class Cat {
   private String name;
    String breed;
    int age;
    double weight;



    public Cat(String catName, String catBreed, int catAge, double catWeight){
        name=catName;
        breed=catBreed;
        age=catAge;
        weight=catWeight;
        System.out.println("Cats constructors is called");
    }

    public void printInfo(){
        System.out.println("Name "+name+" Bread "+breed+" age "+age);
    }

    }


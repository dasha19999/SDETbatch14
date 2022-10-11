package Reps;

public class repl87 {

    String carColor;
    String carYear;
String carMake;
    public static void main(String[] args) {
        repl87 car1 = new repl87();

        car1.carColor="Black";

        car1.carYear="2019";

        car1.carMake="BMW";
        System.out.println("Car color is "+ car1.carColor+" and car year is "+car1.carYear+" and car model is "+car1.carMake);


        repl87 car2= new repl87();
        car2.carColor="White";

        car2.carYear="2018";

        car2.carMake="Toyota";
        System.out.println("Car color is "+ car2.carColor+" and car year is "+car2.carYear+" and car model is "+car2.carMake);
    }
}
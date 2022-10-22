package GroupProject2;

public abstract class  Car {





    double carPrice;
    String color;

    abstract double calculateprice(double a, double b);


}

class Sedan extends Car {
 double length;

    @Override
    double calculateprice(double length, double price) {
        this.length = length;
        carPrice = price;
        double returnPrice;
        if (length > 20) {
            returnPrice = carPrice *.95;

        } else {
            returnPrice = carPrice * .9;

        }
        return returnPrice;
    }

    }
    class Truck extends Car{

    double weight;
    double returnPrice;

        @Override
        double calculateprice(double weight, double price) {

            this.weight=weight;
            carPrice= price;

            if(weight>2000){
                returnPrice = carPrice * .9;


            }else{
                returnPrice = carPrice * .8;
            }
            return returnPrice;

        }
    }


    class TestCar{
        public static void main(String[] args) {

            Truck obj= new Truck();
            Sedan obj2= new Sedan();

            System.out.println(obj.calculateprice(2500,40000));
            System.out.println(obj2.calculateprice(20,30000));



        }

    }
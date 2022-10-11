public class repl114 {
    int mult (int num1, int num2){

        return (num1*num2);
    }
    int add (int num1, int num2){
        return (num1+num2);
    }
    int sub (int num1, int num2){
        return (num1-num2);
    }

    public static void main(String[] args) {
        repl114 main=new repl114();
        int addition=main.add(15,15);
        System.out.println("Addition "+addition);
        int multiplication= main.mult(3,10);
        System.out.println("Multiplication "+multiplication);
        int subtraction= main.sub(30,10);
        System.out.println("Subtraction "+subtraction);
    }
}

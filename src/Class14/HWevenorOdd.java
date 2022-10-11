package Class14;

public class HWevenorOdd {
    void printEvenOdd(int number){

        if(number%2==0){
            System.out.println("Number is Even");
        }else{
            System.out.println("Number is Odd");
        }
    }

    public static  void main(String[] args) {
        HWevenorOdd task=new HWevenorOdd();
        task.printEvenOdd(45);
    }

}

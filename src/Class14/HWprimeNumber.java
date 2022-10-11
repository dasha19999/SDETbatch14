package Class14;

public class HWprimeNumber {
    boolean isPrime(int number){
       boolean isPrime=true;
        if(number>1){
            for(int i=2;i<number;i++){
                if(number%i==0){
                    isPrime= false;
                    break;
                }
            }
        }else{
            isPrime= false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        HWprimeNumber task6=new HWprimeNumber();
        System.out.println(task6.isPrime(12));
    }
}

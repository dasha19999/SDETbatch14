public class repl116 {

    boolean numbers(int num1, int num2){
        if (num1%2==0&&num2%2==0){
            return (true);

        }else{
            return (false);
        }
    }

    public static void main(String[] args) {
        repl116 main=new repl116();
boolean bothEven= main.numbers(2,3);
        System.out.println(bothEven);
    }
}

public class repl117 {

    int numbers(int x){
        int sum = 0;
        if(x>1){
            for(int i=1; i<=x;i++){
                if(i%2==0){
                    sum+=i;
                }
            }
        }
        return (sum);
    }

    public static void main(String[] args) {
        repl117 main=new repl117();
int sum1= main.numbers(8);
        System.out.println(sum1);
    }
}

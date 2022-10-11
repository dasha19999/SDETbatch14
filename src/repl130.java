import javax.swing.tree.AbstractLayoutCache;

public class repl130 {

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        mystery(a);

        // should print out 10 1 30 2 50
    }

    static void mystery(int[] array)	{
int even;
int odd;
for (int i=0;i< array.length;i++){
    if (array[i]%2==0){
        even=array[i]/2;

        System.out.print(even+" ");
    }
    if(array[i]%2!=0){
        odd=array[i]*10;

        System.out.print( odd+" ");
    }


    }
}
    }




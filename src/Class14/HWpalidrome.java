package Class14;

public class HWpalidrome {

    void printPalindrome(String str){
        StringBuilder stringBuilder=new StringBuilder(str.toLowerCase());
        if (stringBuilder.toString().equalsIgnoreCase(str)) {
            System.out.println("this is Palidrome");
        }else{
            System.out.println("not polidrome");
        }
    }

    public static void main(String[] args) {
        HWpalidrome task=new HWpalidrome();
        task.printPalindrome("Dad");
    }
}

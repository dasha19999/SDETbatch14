package Reps;

import java.util.Scanner;

public class repl100 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String s = inp.nextLine();
        //write your code below
        String revers="";
        for(int i=s.length()-1;i>=0;i--){
            revers+=s.charAt(i);
        }
        System.out.println(revers);
    }

}

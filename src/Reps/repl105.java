package Reps;

import java.util.Scanner;

public class repl105 {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("In:");
        String word = inp.nextLine();
        //write your code below

        for(int i=0;i<word.length();i++)
            if (word.charAt(i) == 'a' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'i'||word.charAt(i)=='o') {
                System.out.println(word.charAt(i));
            }

    }

}

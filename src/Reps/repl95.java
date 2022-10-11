package Reps;

import java.util.Scanner;

public class repl95 {
    public static void main(String[] args) {
        String word;

        Scanner scanner=new Scanner (System.in);
        System.out.println("Please enter word?");
        word=scanner.next();
        System.out.println("The first 3 letters of the "+word +" is "+word.substring(0,3));


    }
}
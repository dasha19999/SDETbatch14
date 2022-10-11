package Reps;

import java.util.Scanner;

public class repl104 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        String []names=new String[5];
        System.out.println("Please enter 5 names");
        for(int i=0; i< names.length;i++) {

            names[i] = scanner.next();
            if(names[i].length()>=3){
    System.out.println(names[i].substring(0,3));
}

        }


    }
}
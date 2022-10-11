package RevewClass;

public class Teacher {
    String name, lastName;
    int experience;
    String subject;
    //when we do not create a constractor compiler creates a default constructor

    double salary;
    static String school;
    /*
    How to create constractor
    1.constructor name=classname
    2 no return type not even void

    using below constructor we initialize instance variables (name, lastname)
     */
    Teacher(String fname, String lName){
        name=fname;
        lastName=lName;
    }

    void print (){
        System.out.println(name+lastName);
    }

}

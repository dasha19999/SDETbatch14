package Class13;

public class MethodsDemo4 {

    boolean mystery() {
        return false;
    }
    String mystery2(int num){
        return "Java";}
    String method(String word) {
        //return "Java";
        
            if (word.equalsIgnoreCase("Java")) {
                return "python";
            } else {
                return "Java";
            }

        }
        public static void main (String[]args){
            MethodsDemo4 methodsDemo4 = new MethodsDemo4();
            System.out.println(methodsDemo4.mystery());
            System.out.println(methodsDemo4.mystery2(5));
            System.out.println(methodsDemo4.method("python"));
        }


    }

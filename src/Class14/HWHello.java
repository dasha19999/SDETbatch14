package Class14;

public class HWHello {


    void sayHello(String country){
        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");

                break;
            case "Turkiye":
                System.out.println("Merhaba");

                break;
            case "Pakistan":
                System.out.println("AQA");


                break;
            case "Japan":
                System.out.println("Nihay");

                break;
            default:
                System.out.println("Country not supported");
        }
    }

    public static void main(String[] args) {
        HWHello task4=new HWHello();
        task4.sayHello("USA");
    }
}

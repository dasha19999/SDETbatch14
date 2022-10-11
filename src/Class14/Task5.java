package Class14;

public class Task5 {
    String createEmail(String firstName, String lastname, String emailType){
        return firstName+lastname+"@"+emailType+" com".toLowerCase();
    }

    public static void main(String[] args) {
        Task5 task5=new Task5();
        String fullEmail=task5.createEmail("John","Snow","gmail");

        System.out.println(fullEmail);
    }
}

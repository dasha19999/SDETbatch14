public class HWpolindromeAnotherWay {
    public static void main(String[] args) {


        String str = "dad";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        if (stringBuilder.toString().equals(str)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }
}

import javax.imageio.stream.ImageInputStream;

public class repl134 {
    static int countVowels(String s) {
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'u' || s.charAt(i) == 'o'||s.charAt(i)=='i') {
                number++;
            }
        }
        return number;
    }
        public static void main(String[] args){
            System.out.println(countVowels("obama")); //3
            System.out.println(countVowels("happy friday! i love weekends")); //9
        }
    }




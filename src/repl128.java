public class repl128 {

    static String mixString(String s1, String s2) {
        String answer = "";
        int len = 0;
        if (s1.length() == s2.length()) {
            len = s1.length();
            for (int i = 0; i < len; i++) {
                if (i < s1.length()) {
                    answer += s1.charAt(i);
                }
                if (i < s2.length()) {
                    answer += s2.charAt(i);
                }

            }
        }

        return answer;
    }
        //test case below (dont change):
        public static void main(String[] args){
            String firstValue = mixString("12345","abcde");
            System.out.println(firstValue);
            String secondValue = mixString("howdy","hello");
            System.out.println(secondValue);

        }


    }




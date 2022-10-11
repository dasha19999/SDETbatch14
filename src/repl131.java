public class repl131 {

    static String thirdLetter(String s) {
String answer="";
        for (int i = 0; i < s.length(); i += 3) {
answer+=s.charAt(i);
        }


        return answer;
    }
    public static void main(String[] args){
        System.out.println(thirdLetter("hello there")); //"hltr"
        System.out.println(thirdLetter("technology")); //"thly"
    }
}

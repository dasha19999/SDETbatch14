public class repl133 {
    static int countA(String s){
        int number=0;
        for(int i=0;i<s.length();i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A') {
                number ++;
            }
        }
        return number;
    }
    public static void main(String[] args){
        System.out.println(countA("aaA")); //3
        System.out.println(countA("aaBBdf8k3AAadnklA")); //6
    }
}

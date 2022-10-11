public class repl115 {
    String word(String w1){
        return (w1.toUpperCase());
    }

    public static void main(String[] args) {
        repl115 obj=new repl115();
        String w2= obj.word("test");
        System.out.println(w2);
    }
}

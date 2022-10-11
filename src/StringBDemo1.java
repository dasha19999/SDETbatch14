import javax.swing.plaf.synth.SynthOptionPaneUI;

public class StringBDemo1 {

    public static void main(String[]args){

        StringBuilder stringBuilder=new StringBuilder("Intellij is great");
        System.out.println(stringBuilder);
stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}

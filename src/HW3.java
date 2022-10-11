import java.util.Arrays;

public class HW3 {

    public static void main(String[] args) {
        String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String[] arr2 = str.split("[?]");
        System.out.println(arr2.length);


        String str1 = "This is sentence i want to reverse";
        String[] arr = str1.split(" ");
        StringBuilder st=new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            String word = arr[i];
            StringBuilder stringBuilder = new StringBuilder(word);
            stringBuilder.reverse();
            arr[i] = stringBuilder.toString();
st.append(arr[i]).append(" ");
        }
        System.out.println(st);
    }
}
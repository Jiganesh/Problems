import java.util.*;

public class ProblemZS {
    
    public static String multiTable(int num) {

        List<String> arr = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            String s = i + "*" +num +"="+(i*num);
            arr.add(s);
        }

        return String.join("\n", arr);

    }

    public static void main(String[] args) {
         String ans =multiTable(5);
         System.out.println(ans);
    }
}

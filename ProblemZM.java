import java.util.Arrays;
import java.util.stream.Collectors;

public class ProblemZM {

    public static void main(String[] args) {
        System.out.println(isAnagram("foefet", "toffee"));

    }
    public static boolean isAnagram(String test, String original) {
        // your code goes here
        
        return Arrays.stream(test.split(" ")).sorted().collect(Collectors.joining("")).
        equals(Arrays.stream(original.split(" ")).sorted().collect(Collectors.joining("")));
      }
}

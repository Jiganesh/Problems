
import java.util.Arrays;
import java.util.Scanner;


public class ProblemI {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String[] str = scan.nextLine().split("\\+");
        Arrays.sort(str);
        System.out.println(String.join("+", str));
        scan.close();

    }
}

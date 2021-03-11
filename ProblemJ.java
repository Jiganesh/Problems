import java.util.Scanner;

public class ProblemJ {
    public static void main(String[] args) {
         
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        String result = str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.println(result);
        scan.close();
    }
}

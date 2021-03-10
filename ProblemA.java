import java.util.Scanner;

public class ProblemA{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        String result = (number%2==0 && number!=2)?"YES":"NO";
        System.out.println(result);

        scan.close();
    }
}
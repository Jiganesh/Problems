import java.util.Scanner;

public class ProblemE {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        System.out.println((m*n)/2);
        scan.close();
    }
}

import java.util.Scanner;

public class ProblemT {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int count = scan.next().replaceAll("[^47]", "").length() ;
        System.out.println((count==4||count==7)?"YES":"NO");
        scan.close();
        
    }
}

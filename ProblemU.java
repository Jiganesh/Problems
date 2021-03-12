import java.util.Scanner;

public class ProblemU {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String m = scan.next();
        String n = scan.next();

        StringBuilder a = new StringBuilder(m);
        String c = a.reverse().toString();
        System.out.println((c.compareTo(n)==0)?"YES":"NO");
        scan.close();
    }
}

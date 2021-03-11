import java.util.Scanner;

public class ProblemG {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String n= scan.next().toLowerCase();
        String m= scan.next().toLowerCase();

        int result = n.compareTo(m);

        int answer = (result>0)?1:(result<0)?-1:0;
        System.out.println(answer);
        scan.close();
    }
}

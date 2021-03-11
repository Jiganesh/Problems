import java.util.Scanner;

public class ProblemL {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        
        String s = (str.chars().distinct().count()%2==0)?"CHAT WITH HER!":"IGNORE HIM!";
        
        System.out.println(s);
        scan.close();
    }
}

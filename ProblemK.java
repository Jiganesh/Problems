import java.util.Scanner;

public class ProblemK {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int n = scan.nextInt();
        String str = scan.next();
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (str.charAt(i-1)==str.charAt(i)){
                count++;
            }
        }
        System.out.println(count);
        scan.close();
    }
}

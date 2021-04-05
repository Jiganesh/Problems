import java.util.Scanner;

public class ProblemS{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        String queue = scan.next().substring(0,m);

        while(n-- >0){
            queue = queue.replaceAll("BG", "GB");
        }
        System.out.println(queue);
        scan.close();
    }
}
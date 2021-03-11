import java.util.Scanner;

public class ProblemN {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        int limak = scan.nextInt();
        int bob = scan.nextInt();

        int count =0;
        while(bob>=limak){
            count+=1;
            limak*=3;
            bob*=2;
        }
        System.out.println(count);
        scan.close();
    }
}

import java.util.Scanner;

public class ProblemM{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);


        int k = scan.nextInt();
        int n = scan.nextInt();
        int  w = scan.nextInt();

        int total =0;

        while(w>0){
            total += w*k;
            w-=1;
        }

        int result = (total-n>0)? total-n: 0;
        System.out.println(result);
        scan.close();
    }
}
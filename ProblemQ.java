import java.util.Scanner;

public class ProblemQ {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        int inside = 0, maxnow=0;

        int n = scan.nextInt();
        while(n>0){
            int exit = scan.nextInt();
            int enter = scan.nextInt();

            inside = inside-exit+enter;
            maxnow = (inside>=maxnow)?inside:maxnow;
            n-=1;
        }
        System.out.println(maxnow);
        scan.close();

    }
}

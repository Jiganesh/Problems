import java.util.Scanner;
import java.lang.Math;

public class ProblemH {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int row =0, column=0;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j< 5; j++) {

                int n = scan.nextInt();
                if(n==1){
                    row = i;
                    column =j;
                }
            }
            
        }

        int result = Math.abs(2-row)+Math.abs(2-column);
        System.out.println(result);
        scan.close();

    }
}

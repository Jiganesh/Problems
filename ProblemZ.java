import java.util.Scanner;
import java.util.stream.IntStream;

public class ProblemZ {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int n  = scan.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[scan.nextInt()-1]=i;
        }

        for (int i : array) {
            System.out.print(i+1+" ");
        }

        scan.close();
    }
}

import java.util.Scanner;

public class ProblemD {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int count =0;

        int [] array = new int[m];
        for (int i = 0; i < m; i++) {
            array[i]=scan.nextInt();
        }

        for (int i : array) {
            if (i>= array[n-1] && i>0){
                count+=1;
            }
        }
        System.out.println(count);
        scan.close();
    }
}

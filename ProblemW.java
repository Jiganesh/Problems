import java.util.Scanner;

public class ProblemW {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int y = scan.nextInt();

        while(Integer.toString(++y).chars().distinct().count()<4){

        }
        System.out.println(y);
        scan.close();

    }
}

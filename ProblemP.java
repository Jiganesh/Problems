import java.util.Scanner;

public class ProblemP {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        int number = scan.nextInt();

        int count =0;

        for (int i = 5; i > 0; i--) {
            while(number>0){
                count+=1;
                number-=i;
            }
            
        }

        System.out.println(count);
        scan.close();
    }
}

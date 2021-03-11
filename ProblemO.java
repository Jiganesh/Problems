import java.util.Scanner;

public class ProblemO {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int times = scan.nextInt();

        while (times>0){
            if(number%10==0){
                number=number/10;
            }else{
                number--;
            }
            times-=1;
        }
        System.out.println(number);
        scan.close();
    }
}

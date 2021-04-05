import java.util.Scanner;

public class ProblemY{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);

        int m = scan.nextInt();
        int n = scan.nextInt();

        int count = 0;
         
        while(m-- >0){
            int check =  scan.nextInt();
            if (check > n){
                count +=2;
            }else{
                count+=1;
            }
        }

        System.out.print(count);


        scan.close();
    }
}
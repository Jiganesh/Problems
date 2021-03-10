import java.util.Scanner;

public class ProblemF {
    public static void main(String[] args) {
        
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0 ;
        while(n>0){
            String str = scan.next();
            if (str.contains("++")){
                count+=1;
            }else{
                count-=1;
            }
            n-=1;
        }
        System.out.println(count);
        scan.close();
    }
}

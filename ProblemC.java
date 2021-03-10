import java.util.Scanner;

public class ProblemC{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count =0;
        

        while (n>0){
    
            int petya = scan.nextInt();
            int vatsya = scan.nextInt();
            int tonya = scan.nextInt();
            
            if (petya+vatsya+tonya>1){
                count+=1;
            }
            

            n-=1;
        }
        System.out.println(count);
        scan.close();
    }
}
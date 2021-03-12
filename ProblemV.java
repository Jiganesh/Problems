import java.util.Scanner;

public class ProblemV {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int m = scan.nextInt();
        String match = scan.next();

        int anton =0;

        for (int i = 0; i < m; i++) {
            
            if (match.charAt(i)=='A'){
                anton++;
            }else{
                anton--;
            }

        }
        System.out.println((anton>0)?"Anton":(anton==0)?"Friendship":"Danik");
        scan.close();
    }
}

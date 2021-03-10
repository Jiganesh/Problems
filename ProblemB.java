import java.util.Scanner;

public class ProblemB {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        while (n>=0){
            String str = scan.nextLine();
            int len = str.length();
            String result = "";
            
            if (len>10){
                result = str.substring(0,1)+ (len-2) +str.substring(len-1);
            }else{
                result= str;
            }
            System.out.println(result);
            n-=1;

        }
        scan.close();


    }
    
}

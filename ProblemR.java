import java.util.ArrayList;
import java.util.Scanner;

public class ProblemR {
    public static void main(String[] args) {
        
        ArrayList<Character> uppercase  = new ArrayList<Character>();
        ArrayList<Character> lowercase  = new ArrayList<Character>();



        Scanner scan = new Scanner(System.in);
        String input = scan.next();

        for (int i = 0; i < input.length(); i++) {
            
            if(Character.isLowerCase(input.charAt(i))){
                lowercase.add(input.charAt(i));
            }else{
                uppercase.add(input.charAt(i));
            }
        }

        String result = (lowercase.size()>=uppercase.size())?input.toLowerCase() :input.toUpperCase();
        System.out.println(result);
        scan.close();
    }
}

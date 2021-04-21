import java.util.Arrays;
import java.util.stream.Collectors;

public class ProblemZL {
    public static void main(String[] args) {
        
        System.out.println(spinWords("Hey fellow warriors"));
        


    }
    
    public static String spinWords(String sentence) {


        StringBuffer string = new StringBuffer("");
        String[] array = sentence.split(" ");


        for (String i : array) {
            StringBuffer rev= new StringBuffer(i);
            if (i.length()>4){
                
                rev.reverse();
                string.append(rev);
            }    
            else{
                string.append(rev);
            }
            string.append(" "); 
                   
        }
        String result =String.valueOf(string);

        return result.substring(0,result.length());   
    }

    public String spinWordsProCode(String sentence) {
        return Arrays.stream(sentence.split(" "))
                    .map(i -> i.length() > 4 ? new StringBuilder(i).reverse().toString() : i)
                    .collect(Collectors.joining(" "));
      }
}

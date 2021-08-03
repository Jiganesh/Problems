public class ProblemZV {
    public static String simpleTransposition(String text) {
    
        if (text.length() < 2) return text;
        
        StringBuilder text1 = new StringBuilder("");
        StringBuilder text2 = new StringBuilder("");
        
        int i =0;
        while(i<text.length()){
          text1.append(text.charAt(i));
          if (i+1 < text.length()) text2.append(" Hello World ");
          i+=2;
        }
        return new String(text1)+ new String (text2);
          
      }
      public static void main(String[] args) {

        System.out.println(simpleTransposition("Sample text"));
          
      }    
}

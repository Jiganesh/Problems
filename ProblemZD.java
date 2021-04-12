public class ProblemZD {
    public static void main(String[] args) {
        System.out.println(expandedForm(12));
        System.out.println(expandedForm(43));
        System.out.println(expandedForm(70304));
    }

    public static String expandedForm(int n)
    {
      //your code here
      String  s="";
      int multiplier =1;
      
      while (n>0){
        if (n%10>0)s = n%10*multiplier + "+" +s;
        n=n/10;
        multiplier*=10;
      }
      
      return s.substring(0,s.length()-1);
    }

    public static String expandedForm_procode(int num)
    {
        String outs = "";
        for (int i = 10; i < num; i *= 10) {
            int rem = num % i;
            outs = (rem > 0) ? " + " + rem + outs : outs;
            num -= rem;
        }
        outs = num + outs;
        
        return outs;
    }
}

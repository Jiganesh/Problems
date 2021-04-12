public class ProblemZB {
    public static void main(String[] args) {
        // For example: [1,2,3,4,5] for 2 beggars will return a result of [9,6], as the first one takes [1,3,5], the second collects [2,4].

        int [] values = {1,2,3,4,5};
        int n =2;

        for (int i :beggars(values, n)) {
            System.out.print(i+" ");
        } 
    }
    
    static int[] beggars(int[] values, int n) {

        if(n<=0) return new int[0];

        int [] result = new int[n];
        for (int i = 0; i < values.length; i++) {
            
            result[i%n]+=values[i];
            
            
        }
        return result;
      }
}

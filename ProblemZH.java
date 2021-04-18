public class ProblemZH {

    public static void main(String[] args) {

        System.out.println(rowSumOddNumbers(5)); // 21+23+25+27+29 =125 ;
    }
    

    public static int rowSumOddNumbers(int n) {
        if (n == 1)
            return 1;
        int start = n * (n - 1) + 1;
        int result = 0;
        while (n-- > 0) {
            result += start;
            start += 2;
        }
        return result;
    }
}

/*

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29

rowSumOddNumbers(1); // 1
rowSumOddNumbers(2); // 3 + 5 = 8

*/


/*    sum of consequent M numbers is (M+1)M/2, so 
     * we may know how many numbers were below
     * our ROW : numbersBelow = ((n-1)*(n))/2.
     * Now we may calculate first number in row:
     * firstNumberInRow = 2*numbersBelow+1.
     * So, firstNumberInRow = n*n-n+1 and
     * last number in ROW is n*n-n+1 + 2(n-1).
     * Let assume that last number before row is
     * x1 and last number in row is x2. It's known
     * that 1+3+5+...+(2k-1) = k*k.
     * Sum in row must be x2*x2 - x1*x1. 
     * OUR x1 = (n*n-n)/2 and x2 = (n*n+n)/2.
     * After some simplification: SUM = n*n*n. 
*/
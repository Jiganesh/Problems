import static org.junit.Assert.*;
import org.junit.Test;

import java.util.Arrays;
import java.math.BigInteger;

public class ProblemAB {
    private static void testing(String actual, String expected) {
        assertEquals(expected, actual);
    }
    @Test
    public void test1() {
        int[][] a = new int[][] { {1,2}, {2,9}, {3,18}, {4,24}, {6,48} };
        String r = "[85, 72]";
        testing(SumFractions.sumFracts(a), r);
        a = new int[][] { {1, 2}, {1, 3}, {1, 4} };
        r = "[13, 12]";
        testing(SumFractions.sumFracts(a), r);
        a = new int[][] { {1, 3}, {5, 3} };
        r = "2";
        testing(SumFractions.sumFracts(a), r);
        a = new int[][] {};
        r = null;
    }

}



class SumFractions {
    public static String sumFracts(int[][] l) {
        if (l.length == 0) return null;
        
        final int D = Arrays.stream(l).mapToInt(ar -> ar[1]).reduce(1, (a, b) -> a * b);
        final int N = Arrays.stream(l).mapToInt(ar -> ar[0] * D / ar[1]).sum();

        int gcd = BigInteger.valueOf(D).gcd(BigInteger.valueOf(N)).intValue();
        return (D == gcd) ? String.valueOf(N / D) : String.format("[%d, %d]", N / gcd, D / gcd);
    }
}

// class SumFractions {
//     public static String sumFracts(int[][] l) {
      
//       if (l.length == 0) return null;
      
//       int numerator = l[0][0];
//       int denominator = l[0][1];
//       for (int i =1; i<l.length;i++){
//         int nextnumerator = l[i][0];
//         int nextdenominator = l[i][1];
//         numerator = (numerator*nextdenominator+nextnumerator*denominator);
//         denominator = denominator* nextdenominator;
//         System.out.println(numerator+ " "+ denominator ) ;

//       }
//       int gcdnd = gcd (numerator, denominator);
//       numerator /=gcdnd;
//       denominator/=gcdnd;
      
//       if (denominator==1) return numerator+"";
//       if (numerator > 0 && denominator > 0) return String.format("[%d, %d]",numerator, denominator);
//       return null;
//     }
    
//   public static int gcd(int a , int b){
//       if (a==0) {return b ;}
//       else{return gcd(b%a,a);}
//     }
// }


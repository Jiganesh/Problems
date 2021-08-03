import java.util.*;

class ProblemZU {

    public static boolean primeornot(long curr) {
        for (int i = 2; i * i < curr; i++) {
            if (curr % i == 0)
                return false;
        }
        return true;
    }

    public static long[] step(int g, long m, long n) {

        for (long i= m ; i< n ; i++){
            if (primeornot(i) && primeornot(i+g)){
                return new long []{i, i+g};
            }
        }
        return null;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(step(6, 101,107)));
    }
}
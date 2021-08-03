public class ProblemZT { // must be public for codewars

    public static long[] productFib(long prod) {
        // your code
        long a = 1;
        long b = 1;
        long[] result = new long[3];
        if (prod == 1) return new long[] { 1, 1, 1 };

        while (a * b < prod) {

            long temp = a;
            a = b;
            b = b + temp;

            if (a * b == prod) {
                result[0] = a;
                result[1] = b;
                result[2] = 1;
                return result;
            }
        }
        result[0] = a;
        result[1] = b;
        result[2] = 0;

        return result;
    }

    public static long[] productFibCoolWay(long prod) {
            long x=0;
            long y=1;
            while(x*y<prod) {
              y = x+y;
              x = y-x;
            }
            return new long[] { x, y, x* y == prod ? 1 : 0 };
        }

    public static void main(String[] args) {

        for (long i : productFib(1)) {
            System.out.println(i);
        }
    }
}

// ProdFib.productFib(5895)
// ProdFib.productFib(4895)
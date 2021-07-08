public class ProblemZP {

    public static void main(String[] args) {

        System.out.println(mySqrt(72));
        System.out.println(mySqrt(4));
        System.out.println(mySqrt(8));
        System.out.println(mySqrt(2147395600));
    }

    public static int mySqrt(int x) {
        int left = 1, right = x/2;
        while ( left <= right) {
            int mid = (left + right) /2;
            if (mid*mid > x ) {
                right = mid - 1;
                continue;
            }
            if ((mid+1) *(mid+1)<= x) {
                left = mid + 1;
                continue;
            }
            return mid;
        }
        return x;
    }
    
}

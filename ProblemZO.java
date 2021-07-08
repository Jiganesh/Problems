public class ProblemZO {

    public static void main(String[] args) {
        System.out.println(addBinary("111","1"));
    }

    public static String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;

        int carry =0;

        while(i>=0 || j>=0){
            int sum =carry;
            if(i>=0) sum+=a.charAt(i)-'0';
            if(j>=0) sum+=b.charAt(j)-'0';

            result.append(sum%2);
            carry = sum/2;
            i--;
            j--;

        }

        if (carry==1){
            result.append(carry);
        }

        return result.reverse().toString();


    }
}

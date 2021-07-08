public class ProblemZN {
    public static void main(String[] args) {
        int[] array = { 9, 9 };
        for (int i : plusOne(array)) {
            System.out.println(i);
        }

    }

    public static int[] plusOne(int[] digits) {

        int n = digits.length - 1;
        int carry = 1;
        for (int i = n; i >= 0 && carry == 1; i--) {
            if (digits[i] + 1 > 9) {
                digits[i] = (digits[i] + 1) % 10;
            } else {
                digits[i] = digits[i] + 1;
                carry = 0;
            }
        }

        if (carry != 0) {
            int[] array = new int[digits.length + 1];
            array[0] = 1;
            for (int i = 0; i < digits.length; i++) {
                array[i + 1] = digits[i];
            }
            return array;
        }
        return digits;
    }
}
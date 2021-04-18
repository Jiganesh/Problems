public class ProblemZI {
    public static void main(String[] args) {

        System.out.println(reverseLetter("krishan"));         //  "nahsirk"
        System.out.println(reverseLetter("ultr53o?n"));      //  "nortlu"
        System.out.println(reverseLetter("ab23c"));         //  "cba"
        System.out.println(reverseLetter("krish21an"));    //  "nahsirk"
    }

    public static String reverseLetter(final String str) {

        char[] array = str.toCharArray();
        String result = "";

        for (char i : array) {
            if (i >= 'a' && i <= 'z') {         // Important Step 
                result = i + result;
            }
        }
        return result;
    }

    public static String reverseLetterProSolution(final String s) {
        return new StringBuilder(s.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}

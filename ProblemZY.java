import java.util.Arrays;
import java.util.stream.Collectors;

public class ProblemZY {
    public static void main(String[] args) {
        System.out.println("Interesting Problem");

    }
}

class MorseCodeDecoder {

    public static String decode(String morseCode) {
        return Arrays.stream(morseCode.trim().split("   "))
                .map(MorseCodeDecoder::decodeWord)
                .collect(Collectors.joining(" "));
    }

    private static String decodeWord(String word) {
        //return Arrays.stream(word.split(" ")).map(MorseCode::get).collect(Collectors.joining());
        //Morsecode was given had method get to converst morse dot dash to char
        return " ";
    }
}
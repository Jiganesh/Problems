import java.util.stream.IntStream;

public class ProblemZK{
    public static void main(String[] args) {
        int[] numbers ={17,3,17,17,17,17,17};
        
        System.out.println(stray(numbers));
    }
    public static int stray(int[] numbers) {
        numbers=IntStream.of(numbers).sorted().toArray();
        if(numbers[0]!=numbers[1]) return numbers[0];
        else return numbers[-1];
    }
}
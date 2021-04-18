import java.util.stream.Collectors;

public class ProblemZJ {
    public static void main(String[] args) {
        
        System.out.println(squareDigits(9119));
        System.out.println(squareDigits(0));
        
    }

    public static int squareDigits(int n) {
        
        return Integer.parseInt(String.valueOf(n)
                                    .chars()
                                    .map(i -> Integer.parseInt(String.valueOf((char) i)))
                                    .map(i -> i * i)
                                    .mapToObj(String::valueOf)
                                    .collect(Collectors.joining("")));
    }

}

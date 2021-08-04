import java.util.List;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class ProblemZX {

    public static String howmuch(int m, int n) {
        List<String> solutions = IntStream.rangeClosed(Math.min(m, n), Math.max(m, n))
                .boxed()
                .filter(f -> f % 9 == 1 && f % 7 == 2)
                .map(f -> "[M: " + f + " B: " + f / 7 + " C: " + f / 9 + "]")
                .collect(toList());
        return   "[" +  String.join((""),solutions) + "]";

    }
}
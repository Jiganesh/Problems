
import java.util.stream.IntStream;

class HalvingSum {
  int halvingSum(int n) {
    return IntStream.iterate(n, x -> x != 0, x -> x / 2).sum();
  }
}

public class ProblemAC {

    public static void main(String[] args) {

        HalvingSum h = new HalvingSum();
        System.out.println(h.halvingSum(10));
        System.out.println(h.halvingSum(25));
    }
    
}
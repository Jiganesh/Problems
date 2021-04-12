import java.util.*;
public class ProblemZC {
    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));
        
        
    }
    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here! 
        return stops.stream().mapToInt(x -> x[0]-x[1]).sum();
    }
}

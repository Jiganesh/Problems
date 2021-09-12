// Input = String[] {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}
// Output = "b***i***t***c***o***i***n"

public class ProblemAD{
    public static void main(String[] args) {
        String [] array = {"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"};
        System.out.println(sortAndStar(array));
    }
    public static String sortAndStar(String[] array){
        java.util.Arrays.sort(array);
        return String.join("***",array[0].split(""));   
    }
}

    

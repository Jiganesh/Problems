import java.util.HashMap;
public class ProblemAH {
    public static void main(String[] args) {
        
        System.out.println(longestSubstringWithoutDuplication("clementisacap"));
    }

    public static int longestSubstringWithoutDuplication(String str){
        HashMap <Character, Integer> lastSeen = new HashMap<Character, Integer>();
        int [] longest = new int[2];
        int startIndex =0;
        for(int i =0 ; i< str.length(); i++){
            char c = str.charAt(i);
            if (lastSeen.containsKey(c)) {
                startIndex = Math.max(startIndex, lastSeen.get(c)+1);
            }
            if (longest[1]-longest[0] < i+1-startIndex){
                longest[0]= startIndex;
                longest[1]= i+1;
            }
            lastSeen.put(c, i);
        }

        System.out.println(str.substring(longest[0], longest[1]));
        return longest[1]-longest[0];
    }
}

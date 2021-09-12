// https://www.codewars.com/kata/586d6cefbcc21eed7a001155/train/java

public class ProblemAF {

    public static void main(String[] args) {
        Object [] n= (longestRepetition("abbbbb"));
        for (int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }


    public static Object[] longestRepetition(String s) {

        if( s.length()<1) return new Object[]{"", 0};

        int i =0;
        int pointer = 0;
        int count , currentMax;
        count = currentMax=0;
        Object[] result = new Object[] {s.charAt(i),count};
        while (i < s.length() && pointer < s.length()) {
            if (s.charAt(i) == s.charAt(pointer)) {
                pointer++;
                count++;
            }else{
            if (count > currentMax){
                    currentMax = count;
                    result = new Object []{s.charAt(i)+"", currentMax};
                }
                count = 0;
                i = pointer;
            }
        }
        
        if (count > currentMax){
            currentMax = count;
            result = new Object []{s.charAt(i)+"", currentMax};
        }

        return result;
    }
    
}

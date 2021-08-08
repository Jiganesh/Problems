import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import org.junit.Test;

public class ProblemZW {
    	
    // 1st parameter is the stocklist (L in example), 
	// 2nd parameter is list of categories (M in example)
	public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length<=0 || lstOf1stLetter.length <=0) return "";

        Map <Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < lstOfArt.length; i++) {
            char key = lstOfArt[i].charAt(0);
            int current  = Integer.parseInt(lstOfArt[i].split(" ")[1]);
            if (map.containsKey(key)) {
                map.put(key, map.get(key)+current);
            } else {
                map.put(key, current);  
            }
        }
        
        String [] result = new String[lstOf1stLetter.length];
        for (int i = 0; i < lstOf1stLetter.length; i++) {
            char key = lstOf1stLetter[i].charAt(0);
            String ans = "("+lstOf1stLetter[i] + " : "+ ((map.get(key) !=null)? map.get(key):0)+")";
            result[i] = ans;
        }

        return String.join(" - ", result);

	}

    public static String stockSummaryCoolWay(String[] lstOfArt, String[] lstOf1stLetter) {
        String result = "";
        int total = 0;
        for(int i=0; i< lstOf1stLetter.length; i++) {
            String c = lstOf1stLetter[i];
            int sum = Arrays.stream(lstOfArt)
                    .filter(t -> t.startsWith(c))
                    .mapToInt(t -> Integer.valueOf(t.split(" ")[1])).sum();
            total+=sum;
            result += "".equals(result) ? "" : " - ";
            result += "("+c+" : "+sum+")";
        }
        return total == 0 ? "" : result;
    }
    
    public static void main(String[] args) {
        String L2[] = new String[]{"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String M2[] = new String[]{"A", "B", "C", "W"};
        System.out.println(stockSummary(L2, M2));

    }

	@Test
	public void test1() { 
		String L1[] = new String[]{"ABAR 200", "CDXE 500", "BKWR 250", "BTSQ 890", "DRTY 600"};
    	String M1[] = new String[] {"A", "B"};
    	assertEquals("(A : 200) - (B : 1140)",stockSummary(L1,M1));

        String L2[] = new String[]{"ABART 20", "CDXEF 50", "BKWRK 25", "BTSQZ 89", "DRTYM 60"};
        String M2[] = new String[]{"A", "B", "C", "W"};
        assertEquals("(A : 20) - (B : 114) - (C : 50) - (W : 0)",stockSummary(L2,M2));

	}

}



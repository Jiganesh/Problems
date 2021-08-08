import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ProblemZZ {
    @Test
    public void test1() {
      String pangram1 = "The quick brown fox jumps over the lazy dog.";
      PangramChecker pc = new PangramChecker();
      assertEquals(true, pc.check(pangram1));
    }
    @Test
    public void test2() {
      String pangram2 = "You shall not pass!";
      PangramChecker pc = new PangramChecker();
      assertEquals(false, pc.check(pangram2));
    }
    
}

class PangramChecker {
    public boolean check(String sentence){
      sentence = sentence.toLowerCase().replace(" ","");
      int bitflip = 0;
      for (int i=0; i<sentence.length(); i++){
        int val = sentence.charAt(i)-'a';
        bitflip |= 1<<val;
      }
      return (bitflip ==67108863);
    }
  }
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class ProblemAA {
    @Test
    public void test() {
      assertEquals(")()())()(()()(",
            DuplicateEncoder.encode("Prespecialized"));
      assertEquals("))))())))",DuplicateEncoder.encode("   ()(   "));
    }

}
class DuplicateEncoder {
    static String encode(String word){
      word = word.toLowerCase();
      String result = "";
      for (int i = 0; i < word.length(); ++i) {
        char c = word.charAt(i);
        result += word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")";
      }
      return result;
    }
  }

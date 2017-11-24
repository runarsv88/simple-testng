import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SimpleTest {
   @Test
   public void main() {
      String str = "TestNG is working fine";
      System.out.println(str);
      assertEquals("TestNG is working fine", str);
   }
}

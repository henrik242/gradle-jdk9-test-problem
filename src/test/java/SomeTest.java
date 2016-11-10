import org.junit.Test;
import java.lang.Exception;
import javax.xml.bind.ValidationException;

public class SomeTest {

  @Test(expected = ValidationException.class)
  public void doTest() throws Exception {
    new SomeClass().doStuff();
  }
}

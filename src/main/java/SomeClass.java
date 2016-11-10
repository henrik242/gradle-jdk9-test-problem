import javax.xml.bind.ValidationException;

public class SomeClass {

  public void doStuff() throws ValidationException {
    throw new ValidationException("msg");
  }
}

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    @Test(expected = IllegalArgumentException.class)
    public void testIfHelloWorldWorks() {
        String expected = "Hello World!";
        String unexpected = "Hello, Dave!";

        assertEquals(expected, HelloWorld.hello());
        assertNotEquals(null, HelloWorld.hello());
        assertNotEquals("Hello null!", HelloWorld.hello());
        assertNotEquals("Hello null!", HelloWorld.hello(null));
        assertEquals(expected, HelloWorld.hello());


    }
}

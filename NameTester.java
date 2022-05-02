import static org.junit.Assert.*;
import org.junit.*;
public class NameTester {
    @Test
    public void naming() {
        assertEquals("Hello, my name is Josue Martinez", Name.naming("Josue", "Martinez"));
    }
}

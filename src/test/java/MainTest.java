import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 *
 * @author David Kristiansen (W0242502)
 * @filename MainTest.java
 * @since 10:04 AM 2026-03-23
 */
class MainTest {

    @Test
    void getGreeting_returnsHelloMaven() {
        assertEquals("Hello, Maven!", Main.getGreeting());
    }
}
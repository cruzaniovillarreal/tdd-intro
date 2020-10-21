import org.junit.Test;
import static org.junit.Assert.*;
public class CodeupCryptTest {
    @Test
    public void testIfVersionIsSet() {
        assertEquals(0.0, CodeupCrypt.version, 0);
        CodeupCrypt.version = 2.0;
        assertEquals(2.0, CodeupCrypt.version, 0);
        assertNotEquals(2.5, CodeupCrypt.version, 0);
    }

    @Test
    public void testHashPassword() {
        assertEquals("43109", CodeupCrypt.hashPassword("aeiou"));
        assertEquals("J4ck", CodeupCrypt.hashPassword("Jack"));
        assertEquals("4ppl3", CodeupCrypt.hashPassword("apple"));
    }

    @Test
    public void testValidatePassword() {
        assertTrue("check password", CodeupCrypt.checkPassword("fer", "f3r"));
        assertFalse("check password", CodeupCrypt.checkPassword("fer", "fer"));
    }
}

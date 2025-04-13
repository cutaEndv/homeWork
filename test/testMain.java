import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    @Test
    public void testPalindromeLowercase() {
        assertTrue(Main.refactoredCheckIfPalindromeHelper("madam"));
    }

    @Test
    public void testPalindromeMixedCase() {
        assertTrue(Main.refactoredCheckIfPalindromeHelper("RaceCar"));
    }

    @Test
    public void testNonPalindrome() {
        assertFalse(Main.refactoredCheckIfPalindromeHelper("hello"));
    }

    @Test
    public void testSingleCharacter() {
        assertTrue(Main.refactoredCheckIfPalindromeHelper("a"));
    }

    @Test
    public void testEmptyString() {
        assertTrue(Main.refactoredCheckIfPalindromeHelper(""));
    }

    @Test
    public void testNullInput() {
        assertFalse(Main.refactoredCheckIfPalindromeHelper(null));
    }
}

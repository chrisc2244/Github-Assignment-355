// Test1.java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestOne {
    @Test
    public void testCase1() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }
}

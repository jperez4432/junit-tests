import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class MyFirstTest {
    @Test
    public void isCodeupCodeup() {
        String correct = "Codeup";
        String commonly = "CodeUp";

        assertNotEquals(correct, commonly);

    }

    @Test
    public void listsAreDifferent() {
        List<String> languages = new ArrayList<>();
        List<String> moreLanguages = new ArrayList<>();

        assertNotSame(languages, moreLanguages);
    }

    @Test
    public void arraysAreEqual() {
        int[] arrayOfInts = {1, 2, 3, 4};
        int[] yetMoreInts = {1, 2, 3, 4, 8};

        assertArrayEquals(arrayOfInts, yetMoreInts);
    }
        @Test
                public void funWithPHP() {
            String language = "PHP";
            assertTrue(language.contains("H"));
            assertFalse(language.contains("J"));

    }
}

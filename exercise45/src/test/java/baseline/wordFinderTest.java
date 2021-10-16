package baseline;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class wordFinderTest {
    wordFinder fM = new wordFinder();
    @Test
    public void test_read() throws FileNotFoundException {
        ArrayList<String> expected = new ArrayList<String>();
        ArrayList<String> actual;
        expected.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        expected.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        expected.add("utilizes an IDE to write her Java programs\".");
        actual = fM.readStory("data/exercise45_input.txt");
        assertEquals(actual,expected);
    }
    @Test
    public void test_writeStory() throws IOException {
        ArrayList<String> expected = new ArrayList<String>();
        fM.words.add("One should never utilize the word \"utilize\" in writing. Use \"use\" instead.");
        fM.words.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        fM.words.add("utilizes an IDE to write her Java programs\".");
        ArrayList<String> actual;
        expected.add("One should never use the word \"use\" in writing. Use \"use\" instead.");
        expected.add("\n");
        expected.add("For example, \"She uses an IDE to write her Java programs\" instead of \"She");
        expected.add("\n");
        expected.add("uses an IDE to write her Java programs\".");
        expected.add("\n");
        actual = fM.writeStory("data/exercise45_output.txt");
        assertEquals(actual,expected);
    }

}
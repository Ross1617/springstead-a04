package baseline;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class nameSorterTest {
    @Test
    //test the read names
    public void test_readNames() throws FileNotFoundException {
        nameSorter ns = new nameSorter();
        //creates an array list of expected
        ArrayList<String> testNames = new ArrayList<>();
        ArrayList<String> readNames ;
        testNames.add("Ling, Mai");
        testNames.add("Johnson, Jim");
        testNames.add("Zarnecki, Sabrina");
        testNames.add("Jones, Chris");
        testNames.add("Jones, Aaron");
        testNames.add("Swift, Geoffrey");
        testNames.add("Xiong, Fong");
        readNames = ns.readNames("data/exercise41_input.txt");
        //compares the two
        assertEquals(readNames,testNames);

    }
    @Test
    //testing sortedNames
    public void test_sortNames(){
        nameSorter ns = new nameSorter();
        ArrayList<String> testNames = new ArrayList<>();
        ArrayList<String> expectedSortedNames = new ArrayList<>();
        ArrayList<String> sortedNames;
        testNames.add("Ling, Mai");
        testNames.add("Johnson, Jim");
        testNames.add("Zarnecki, Sabrina");
        testNames.add("Jones, Chris");
        testNames.add("Jones, Aaron");
        testNames.add("Swift, Geoffrey");
        testNames.add("Xiong, Fong");
        ns.names = testNames;
        sortedNames = ns.sortNames();
        expectedSortedNames.add("Johnson, Jim");
        expectedSortedNames.add("Jones, Aaron");
        expectedSortedNames.add("Jones, Chris");
        expectedSortedNames.add("Ling, Mai");
        expectedSortedNames.add("Swift, Geoffrey");
        expectedSortedNames.add("Xiong, Fong");
        expectedSortedNames.add("Zarnecki, Sabrina");
        //compares the two
        assertEquals(sortedNames,expectedSortedNames);
    }
    //testing writeNames
    @Test
    public void test_writeNames() throws IOException {
        nameSorter ns = new nameSorter();
        ArrayList<String> readNames ;
        ArrayList<String> testNames = new ArrayList<>();
        ArrayList<String> expectedSortedNames = new ArrayList<>();
        expectedSortedNames.add("Johnson, Jim");
        expectedSortedNames.add("Jones, Aaron");
        expectedSortedNames.add("Jones, Chris");
        expectedSortedNames.add("Ling, Mai");
        expectedSortedNames.add("Swift, Geoffrey");
        expectedSortedNames.add("Xiong, Fong");
        expectedSortedNames.add("Zarnecki, Sabrina");
        testNames.add("Johnson, Jim");
        testNames.add("Jones, Aaron");
        testNames.add("Jones, Chris");
        testNames.add("Ling, Mai");
        testNames.add("Swift, Geoffrey");
        testNames.add("Xiong, Fong");
        testNames.add("Zarnecki, Sabrina");
        ns.names = testNames;
        readNames = ns.writeNames("data/exercise41_output.txt");
        //compares the two
        assertEquals(readNames,expectedSortedNames);
    }

}
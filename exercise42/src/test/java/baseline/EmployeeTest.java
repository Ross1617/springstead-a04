package baseline;

import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    public  void test_readNames() throws FileNotFoundException {
        Employee emp = new Employee();
        ArrayList<String> testNames = new ArrayList<>();
        ArrayList<String> readNames ;
        testNames.add("Ling,Mai,55900");
        testNames.add("Johnson,Jim,56500");
        testNames.add("Jones,Aaron,46000");
        testNames.add("Jones,Chris,34500");
        testNames.add("Swift,Geoffrey,14200");
        testNames.add("Xiong,Fong,65000");
        testNames.add("Zarnecki,Sabrina,51500");
        readNames = emp.readNames("data/exercise42_input.txt");
        //compares the two
        assertEquals(readNames,testNames);
    }


}
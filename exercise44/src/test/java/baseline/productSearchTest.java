package baseline;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class productSearchTest {
    productSearch pS = new productSearch();
    @Test
    public void test_Search1() throws IOException {
        pS.searchTerm = "Thing";
        int expected = 1;
        int actual = pS.search();
        assertEquals(actual,expected);
    }
    @Test
    public  void test_Search2() throws IOException {
        pS.searchTerm = "Apple";
        int expected = 0;
        int actual = pS.search();
        assertEquals(actual,expected);

    }


}
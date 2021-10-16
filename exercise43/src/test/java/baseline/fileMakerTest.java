package baseline;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class fileMakerTest {
    fileMaker fM = new fileMaker();
    @Test
    public void test_getSiteName(){
        fM.setSiteName("PabloSite");
        String expected = "PabloSite";
        assertEquals(expected, fM.siteName );
    }
    @Test
    public void test_getAuthorName(){
        fM.setAuthorName("Pablo");
        String expected = "Pablo";
        assertEquals(expected, fM.authorName );
    }
    @Test
    public void test_getJavaScript(){
        fM.setJavaScript("y");
        String expected = "y";
        assertEquals(expected, fM.javaScript );
    }
    @Test
    public void test_getCSS(){
        fM.setCSS("n");
        String expected = "n";
        assertEquals(expected, fM.CSS );
    }
    @Test
    public void test_createFiles() throws IOException {
        fM.setSiteName("Ahh");
        fM.setAuthorName("Pabloe");
        fM.setJavaScript("y");
        fM.setCSS("n");
        int value = fM.createFiles();
        int expectedFilesCreated = 3;
        assertEquals(value,expectedFilesCreated);
    }





}
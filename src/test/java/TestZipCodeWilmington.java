import io.zipcoder.interfaces.ZipCodeWilmington;
import org.junit.Test;

public class TestZipCodeWilmington {
    @Test
    public void testMap(){
        ZipCodeWilmington a = ZipCodeWilmington.getInstance();

        System.out.println(a.getStudyMap());
    }
}

import org.example.Maior;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaiorTest {

    Maior m = new Maior();

    @Test
    public void c1(){
        assertEquals(true, m.maior(3,2));
    }
    @Test
    public void c2(){
        assertEquals(false, m.maior(2,3));
    }
}

import org.example.Calculadora;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    Calculadora calculadora = new Calculadora();

    @Test
    public void somar(){
        assertEquals(2, calculadora.somar(1,1));
    }

    @Test
    public void somar1(){
        assertEquals(0, calculadora.somar(0,0));
    }

}

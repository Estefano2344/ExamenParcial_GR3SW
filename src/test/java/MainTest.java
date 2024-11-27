import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MainTest {

    // Prueba unitaria para la función suma
    @Test
    public void testSuma() {
        // Realizamos la prueba de suma(5, 3)
        int resultado = Main.suma(5, 3);
        
        // Verificamos que el resultado sea 8
        assertEquals(8, resultado, "La suma debe ser 8");
    }
}

import org.junit.jupiter.api.Test;
import static org.junit.jupiter .api.Assertions.assertEquals;


public class MainTest {
    Main main = new Main();

    @Test
    void additional(){
        assertEquals(2, main.add(1,1));
    }
    @Test
    void subtraction(){
        assertEquals(7, main.sub(10,3));
    }
    @Test
    void Multiplication(){
        assertEquals(6, main.multi(2,3));
    }
    @Test
    void Division(){
        assertEquals(6, main.div(18,3));
    }
}

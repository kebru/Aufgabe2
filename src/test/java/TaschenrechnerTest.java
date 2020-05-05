import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TaschenrechnerTest {

    Taschenrechner ts = new Taschenrechner();

    @Test
    void constructor() {
        Taschenrechner ts = null;
        ts = new Taschenrechner();
        assertNotNull(ts);
        assertEquals(Taschenrechner.class, ts.getClass());
    }

    @Test
    void addDouble() {
        assertEquals(5, ts.add(2, 3));
        assertEquals(5.1111111111111111, ts.add(2.1111111111111111111111111111111, 3));
    }

    @Test
    void subDouble() {
        assertEquals(-1, ts.sub(2, 3));
    }

    @Test
    void multiDouble() {
        assertEquals(6, ts.multi(2, 3));
    }

    @Test
    void divDouble() {
        assertEquals(2, ts.div(4, 2));
        assertThrows(ArithmeticException.class, ()->{
            ts.div(3,0);
        });
    }

    @Test
    void addInt() {
        assertEquals(5, ts.add(2, 3));
        assertEquals(5, ts.add(2, 3));
        assertEquals(5.1111111111111111, ts.add(2.1111111111111111111111111111111, 3));
    }

    @Test
    void subInt() {
        assertEquals(-1, ts.sub(2, 3));
    }

    @Test
    void multiInt() {
        assertEquals(6, ts.multi(2, 3));
    }

    @Test
    void divInt() {
        assertEquals(2, ts.div(4, 2));
        assertThrows(ArithmeticException.class, ()->{
            ts.div(3,0);
        });
    }


}
import org.junit.Test;
import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class TriangleTest {

    @Test
    public void testPerimeter() {
        assertEquals(30, Triangle.perimeter(5, 10, 15), 0);
        assertNotEquals(35, Triangle.perimeter(5, 10, 15), 0);
    }

    @Test
    public void testArea() {
        assertEquals(75, Triangle.area(10, 15), 0);
        assertNotEquals(90, Triangle.area(10, 15), 0);
    }

    @Test
    public void testPythagoras() {
        assertEquals(11, Math.round(Triangle.pythagoras(5, 10, 15)), 0);
        assertNotEquals(11.18, Triangle.pythagoras(5, 10, 15), 0);
    }

}

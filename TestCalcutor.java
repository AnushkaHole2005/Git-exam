import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalcutor {
    private final Calculator cal = new Calculator();

    @Test
    public void testAdd() {
       Assert.assertEquals(cal.add(6, 8), 14);
    }

    @Test
    public void testSub() {
       Assert.assertEquals(cal.sub(10, 8), 2);
    }

    @Test
    public void testMul() {
       Assert.assertEquals(cal.multiply(3, 4), 12);
    }

    @Test
    public void testDiv() {
       Assert.assertEquals(cal.div(8, 2), 4);
    }
}

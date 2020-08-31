package ee.itcollage.level3;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AbsoluteNumberTest {
    @Test
    public void minus_10() {
        assertEquals(10, AbsoluteNumber.makeAbsolute(-10));
    }
}

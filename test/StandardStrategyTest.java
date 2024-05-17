import org.junit.Test;
import strategy.StandardStrategy;
import strategy.TransferMethod;

import static org.junit.Assert.assertEquals;

public class StandardStrategyTest {
    @Test
    public void getCostTest() {
        double weight = 12.3;
        StandardStrategy strategy = new StandardStrategy();
        assertEquals(weight * 2.5, strategy.getCost(weight), 2);
    }

    @Test
    public void transferMethodTest() {
        StandardStrategy strategy = new StandardStrategy();
        assertEquals(TransferMethod.Standard, strategy.getTransferMethod());
    }
}

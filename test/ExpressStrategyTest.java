import org.junit.Test;
import strategy.ExpressStrategy;
import strategy.TransferMethod;

import static org.junit.Assert.assertEquals;

public class ExpressStrategyTest {
    @Test
    public void getCostTest() {
        double weight = 12.3;
        ExpressStrategy strategy = new ExpressStrategy();
        assertEquals(weight * 3.5, strategy.getCost(weight), 2);
    }

    @Test
    public void transferMethodTest() {
        ExpressStrategy strategy = new ExpressStrategy();
        assertEquals(TransferMethod.Express, strategy.getTransferMethod());
    }
}

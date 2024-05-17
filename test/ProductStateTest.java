import model.Product;
import org.junit.Test;
import state.DeliveredState;
import state.InTransitState;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ProductStateTest {
    @Test
    public void setStateTest() {
        Product product = Product.getInstance();
        product.transfer();
        assertTrue(product.getState() instanceof InTransitState);
        assertFalse(product.getIsDelivered());
        product.deliver();
        assertTrue(product.getState() instanceof DeliveredState);
        assertTrue(product.getIsDelivered());
    }
}

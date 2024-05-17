package state;

import model.Product;

public class DeliveredState extends State {
    public DeliveredState(Product product) {
        super(product);
    }

    @Override
    public void transferProduct() {
        System.out.println("the product has been delivered");
    }

    @Override
    public void deliverProduct() {
        System.out.println("the product has been delivered");
    }
}

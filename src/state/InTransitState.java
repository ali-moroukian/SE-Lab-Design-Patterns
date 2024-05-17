package state;

import model.Product;

public class InTransitState extends State {

    public InTransitState(Product product) {
        super(product);
    }

    @Override
    public void transferProduct() {
        System.out.println("The product is in transit state!");
    }

    @Override
    public void deliverProduct() {
        this.product.setState(
                new DeliveredState(this.product)
        );
        this.product.setDelivered(true);
        System.out.println("the product has been delivered!");
    }
}

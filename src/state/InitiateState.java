package state;

import model.Product;

public class InitiateState extends State {

    public InitiateState(Product product) {
        super(product);
    }

    @Override
    public void transferProduct() {
        this.product.setState(
                new InTransitState(this.product)
        );
        System.out.println("product state changed to In-transit!");
    }

    @Override
    public void deliverProduct() {
        System.out.println("you can not deliver product which is not in transit");
    }
}

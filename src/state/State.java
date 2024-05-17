package state;


import model.Product;

public abstract class State {
    protected Product product;

    public State(Product product) {
        this.product = product;
    }

    public abstract void transferProduct();

    public abstract void deliverProduct();
}

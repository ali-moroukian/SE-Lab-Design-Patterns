package model;

import state.InitiateState;
import state.State;

public class Product {
    private static Product product;

    private boolean isDelivered;
    private State state;

    public Product() {
        this.state = new InitiateState(this);
        this.isDelivered = false;
    }

    public static Product getInstance() {
        if (Product.product == null) {
            Product.product = new Product();
        }
        return Product.product;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void setDelivered(boolean delivered) {
        isDelivered = delivered;
    }

    public boolean getIsDelivered() {
        return this.isDelivered;
    }

    public void transfer() {
        this.state.transferProduct();
    }

    public void deliver() {
        this.state.deliverProduct();
    }
}

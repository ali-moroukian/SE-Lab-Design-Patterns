package model;

import state.InitiateState;
import state.State;
import strategy.Strategy;

public class Product {
    private static Product product;

    private boolean isDelivered;
    private State state;
    private int weight;
    private Strategy transferStrategy;

    public Product() {
        this.state = new InitiateState(this);
        this.isDelivered = false;
        this.weight = 0;
        this.transferStrategy = null;
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

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Strategy getTransferStrategy() {
        return transferStrategy;
    }

    public void setTransferStrategy(Strategy transferStrategy) {
        this.transferStrategy = transferStrategy;
    }

    public double getCost() {
        return this.transferStrategy.getCost(this.weight);
    }

    public void transfer() {
        this.state.transferProduct();
    }

    public void deliver() {
        this.state.deliverProduct();
    }
}

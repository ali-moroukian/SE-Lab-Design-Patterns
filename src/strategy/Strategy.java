package strategy;


public interface Strategy {
    public double getCost(double weight);

    public TransferMethod getTransferMethod();
}

package strategy;

public class StandardStrategy implements Strategy {
    @Override
    public double getCost(double weight) {
        return weight * 2.5;
    }

    @Override
    public TransferMethod getTransferMethod() {
        return TransferMethod.Standard;
    }
}

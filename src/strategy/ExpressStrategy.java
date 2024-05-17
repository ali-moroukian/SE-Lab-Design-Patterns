package strategy;

public class ExpressStrategy implements Strategy {
    @Override
    public double getCost(double weight) {
        return weight * 3.5;
    }

    @Override
    public TransferMethod getTransferMethod() {
        return TransferMethod.Express;
    }
}

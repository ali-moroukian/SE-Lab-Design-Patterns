import model.Product;
import strategy.ExpressStrategy;
import strategy.StandardStrategy;
import strategy.Strategy;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Product product = Product.getInstance();
        System.out.println("product weight:");
        double weight = scanner.nextDouble();

        // to set initiate weight of the product
        product.setWeight(weight);
        // to change product state to in-transit state
        product.transfer();

        do {
            System.out.println("strategy for transferring the product:\n(1 = standard, 2 = express):");
            int strategy = scanner.nextInt();

            System.out.println("current state of the product:\n(1 = transit, 2 = delivered):");
            int state = scanner.nextInt();

            Strategy strategyObj = null;
            if (strategy == 1) {
                strategyObj = new StandardStrategy();
            } else if (strategy == 2) {
                strategyObj = new ExpressStrategy();
            }

            product.setTransferStrategy(strategyObj);
            if (state == 1) {
                product.transfer();
            } else if (state == 2) {
                product.deliver();
            }

        } while (!product.getIsDelivered());

        System.out.print("The total cost of transferring the product is: " + product.getCost());
    }
}

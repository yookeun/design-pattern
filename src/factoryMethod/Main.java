package factoryMethod;

import factoryMethod.framwork.Factory;
import factoryMethod.framwork.Product;
import factoryMethod.idcard.IDCard;
import factoryMethod.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product card1 = factory.create("Youngiin Kim");
        Product card2 = factory.create("Heungim Son");
        Product card3 = factory.create("Kane");
        card1.use();
        card2.use();
        card3.use();
    }
}

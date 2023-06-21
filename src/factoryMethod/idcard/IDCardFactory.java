package factoryMethod.idcard;

import factoryMethod.framwork.Factory;
import factoryMethod.framwork.Product;

public class IDCardFactory extends Factory {

    private static int num = 100;

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, num++);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + " 를 등록했습니다.");
    }
}

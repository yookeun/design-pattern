package factoryMethod.idcard;

import factoryMethod.framwork.Product;

public class IDCard extends Product {

    private final String owner;
    private final int cardNo;

    IDCard(String owner, int cardNo) {
        this.owner = owner;
        this.cardNo = cardNo;
    }

    @Override
    public void use() {
        System.out.println(this + " 을 사용합니다");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "], cardNo = " + cardNo;
    }

    public String getOwner() {
        return owner;
    }
}

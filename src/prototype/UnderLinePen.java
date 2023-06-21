package prototype;


import prototype.framework.ConcreteProduct;
import prototype.framework.Product;

public class UnderLinePen extends ConcreteProduct {

    private char ulchar;

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

}

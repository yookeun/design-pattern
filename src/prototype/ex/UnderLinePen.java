package prototype.ex;


import prototype.framework.ConcreteProduct;

public class UnderLinePen implements Product {

    private char ulchar;

    private UnderLinePen underLinePen;

    public UnderLinePen(UnderLinePen underLinePen) {
        this.ulchar = underLinePen.ulchar;
    }

    public UnderLinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        System.out.println(s);
        for (int i = 0; i < ulen; i++) {
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    public Product createCopy() {
        return new UnderLinePen(this);
    }
}

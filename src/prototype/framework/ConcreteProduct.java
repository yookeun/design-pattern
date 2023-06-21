package prototype.framework;

public class ConcreteProduct implements Product{

    Product p;
    @Override
    public void use(String s) {
        p.use(s);
    }

    @Override
    public Product createCopy() {
        try {
            p = (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return p;
    }
}

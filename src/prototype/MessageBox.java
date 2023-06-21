package prototype;

import prototype.framework.ConcreteProduct;


public class MessageBox extends ConcreteProduct {

    private char decochar;

    private MessageBox messageBox;


    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    public void use(String s) {
        int decolen = 1 + s.length() + 1;
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();
        System.out.println(decochar + s + decochar);
        for (int i = 0; i < decolen; i++) {
            System.out.print(decochar);
        }
        System.out.println();

    }

}

package prototype.ex;



public class MessageBox implements Product {



    private char decochar;

    private MessageBox messageBox;

    public MessageBox(MessageBox messageBox) {
        this.decochar = messageBox.decochar;
    }

    public MessageBox(char decochar) {
        this.decochar = decochar;
    }

    @Override
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

    @Override
    public Product createCopy() {
        return new MessageBox(this);
    }
}

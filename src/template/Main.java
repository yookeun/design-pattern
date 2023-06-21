package template;

import factoryMethod.idcard.IDCard;

public class Main {
    public static void main(String[] args) {
        //'H'를 가진 CharDisplay 인스턴스를 만든다.
        AbstractDisplay charDisplay = new CharDisplay('H');

        //"Hello, world" 를 가진 StringDisplay를 만든다.
        AbstractDisplay stringDisplay = new StringDisplay("Hello, world");

        charDisplay.display();
        stringDisplay.display();


    }
}

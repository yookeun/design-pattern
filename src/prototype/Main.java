package prototype;

import prototype.MessageBox;
import prototype.UnderLinePen;
import prototype.framework.Manager;
import prototype.framework.Product;

public class Main {
    public static void main(String[] args) {
        //준비

        Manager manager = new Manager();
        UnderLinePen upen = new UnderLinePen('-');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');


        //등록
        manager.register("strong_msg", upen);
        manager.register("waring_msg", mbox);
        manager.register("slash_msg", sbox);


        //생성과 사용
        Product p1 = manager.create("strong_msg");
        p1.use("Hello, world");

        Product p2 = manager.create("waring_msg");
        p2.use("Hello, world");

        Product p3 = manager.create("slash_msg");
        p3.use("Hello, world");
    }
}

package template;

public interface AbstractDisplay {
    //open, print, close 는 하위 클래스에게 위임한다
    void open();
    void print();
    void close();

    //display는 여기서 직접 구현
    default void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

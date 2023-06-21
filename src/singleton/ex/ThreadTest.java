package singleton.ex;

public class ThreadTest extends Thread {
    @Override
    public void run() {
        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }

    public static void main(String[] args) {
        System.out.println("Start");
        new ThreadTest("A").start();
        new ThreadTest("B").start();
        new ThreadTest("C").start();
        new ThreadTest("D").start();

    }

    public ThreadTest(String name) {
        super(name);
    }
}

package singleton.ex;

public class Singleton {

    private Singleton() {
        System.out.println("인스턴스를 생성했습니다.");
        //slowdown();
    }

    private static class SingletonHolder {
        private static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}

package creationtype_02.Singleton;

/**
 * 该模式的特点是类一旦加载就创建一个单例，保证在调用 getInstance 方法之前单例已经存在了。
 */
public class SingletonEager {
    public static void main(String[] args) {
    Bajie obj1 = Bajie.getInstance();
    Bajie obj2 = Bajie.getInstance();
    if (obj1 == obj2) {
        System.out.println("他们是同一人！");
    } else {
        System.out.println("他们不是同一人！");
    }
}
}
class Bajie {
    private static Bajie instance = new Bajie();
    private Bajie() {
        System.out.println("猪八戒！");
    }
    public static Bajie getInstance() {
        return instance;
    }
}
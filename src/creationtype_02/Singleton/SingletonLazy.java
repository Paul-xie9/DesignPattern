package creationtype_02.Singleton;

/**
 * 用懒汉式单例模式模拟产生美国当今总统对象。
 * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。代码如下：
 */
public class SingletonLazy {
    public static void main(String[] args) {
        President president = President.getInstance();
        president.getName();    //输出总统名字
        President president1 = President.getInstance();
        president1.getName();
        if (president==president1){
            System.out.println("他们是同一人！");
        }else{
            System.out.println("他们不是同一人!");
        }
    }

}

//总统
class President {
    private static volatile President instance = null;  //保证instance在所有线程中同步

    private President() {    //private避免类被外部实例化
        System.out.println("产生一个总统！");
    }

    public static synchronized President getInstance() { //在getInstance方法上加同步锁
        if (instance == null) {
            instance = new President();
        } else {
            System.out.println("已经有一个总统了，不能再产生新总统，准备下一届吧！");
        }
        return instance;
    }

    public void getName() {
        System.out.println("我是美国总统:拜登。");
    }
}

package principle.LSP;

/**
 * 里氏代换原则：所有引用基类（父类）的地方必须能透明的使用其子类
 *
 * 对里氏替换原则的定义可以总结如下：
 * 子类可以实现父类的抽象方法，但不能覆盖父类的非抽象方法
 * 子类中可以增加自己特有的方法
 * 当子类的方法重载父类的方法时，方法的前置条件（即方法的输入参数）要比父类的方法更宽松
 * 当子类的方法实现父类的方法时（重写/重载或实现抽象方法），方法的后置条件（即方法的的输出/返回值）要比父类的方法更严格或相等
 */
public class Main {
    public static void main(String[] args) {
        Bird bird1 = new Swallow();
        Bird bird2 = new BrownKiwi();
        bird1.setFlySpeed(120);
        bird2.setFlySpeed(120);
        System.out.println("如果飞行300公里：");
        try {
            System.out.println("燕子将飞行" + bird1.getFlyTime(300) + "小时.");
            System.out.println("几维鸟将飞行" + bird2.getFlyTime(300) + "小时。");
        } catch (Exception err) {
            System.out.println("发生错误了!");
        }
    }
}

//鸟类
class Bird{
    double flySpeed;

    public double getFlyTime(double distance) {
        return (distance/flySpeed); //飞行时间
    }

    public void setFlySpeed(double fiySpeed) {
        this.flySpeed = fiySpeed;   //飞行速度
    }
}

//燕子类
class Swallow extends Bird{

}

//几维鸟类
class BrownKiwi extends Bird{
    public void setFlySpeed(double fiySpeed){
        fiySpeed = 0;
    }
}

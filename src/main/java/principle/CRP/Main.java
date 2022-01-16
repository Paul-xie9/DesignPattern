package principle.CRP;

/**
 * 合成复用原则（Composite Reuse Principle，CRP）又叫组合/聚合复用原则（Composition/Aggregate Reuse Principle，CARP）。
 * 它要求在软件复用时，要尽量先使用组合或者聚合等关联关系来实现，其次才考虑使用继承关系来实现。
 * <p>
 * 如果要使用继承关系，则必须严格遵循里氏替换原则。合成复用原则同里氏替换原则相辅相成的，两者都是开闭原则的具体实现规范。
 */
public class Main {
    public static void main(String[] args) {
        GasolineCar gasolineCar = new GasolineCar();
        ElectricCar electricCar = new ElectricCar();
        gasolineCar.getColor(new Color().back);
        gasolineCar.move();
        electricCar.getColor(new Color().red);
        electricCar.move();
    }
}

//汽车类
abstract class Car {
    String color;
    public String getColor(String color) {
        this.color=color;
        return color;
    }

    public abstract void move();
}

//汽车颜色
class Color {
    String white = "白色";
    String back = "黑色";
    String red = "红色";
}

//汽油汽车
class GasolineCar extends Car {
    public void move() {
        System.out.println(color+"汽油汽车...");
    }
}

//电动汽车
class ElectricCar extends Car {

    @Override
    public void move() {
        System.out.println(color+"电动车...");
    }
}
/**
 * 设计原则	一句话归纳	目的
 * 开闭原则	对扩展开放，对修改关闭	降低维护带来的新风险
 * 依赖倒置原则	高层不应该依赖低层，要面向接口编程	更利于代码结构的升级扩展
 * 单一职责原则	一个类只干一件事，实现类要单一	便于理解，提高代码的可读性
 * 接口隔离原则	一个接口只干一件事，接口要精简单一	功能解耦，高聚合、低耦合
 * 迪米特法则	不该知道的不要知道，一个类应该保持对其它对象最少的了解，降低耦合度	只和朋友交流，不和陌生人说话，减少代码臃肿
 * 里氏替换原则	不要破坏继承体系，子类重写方法功能发生改变，不应该影响父类方法的含义	防止继承泛滥
 * 合成复用原则	尽量使用组合或者聚合关系实现代码复用，少使用继承	降低代码耦合
 *
 * 实际上，这些原则的目的只有一个：降低对象之间的耦合，增加程序的可复用性、可扩展性和可维护性。
 *
 * 记忆口诀：访问加限制，函数要节俭，依赖不允许，动态加接口，父类要抽象，扩展不更改。
 *
 * 在程序设计时，我们应该将程序功能最小化，每个类只干一件事。若有类似功能基础之上添加新功能，则要合理使用继承。
 * 对于多方法的调用，要会运用接口，同时合理设置接口功能与数量。最后类与类之间做到低耦合高内聚。
 */



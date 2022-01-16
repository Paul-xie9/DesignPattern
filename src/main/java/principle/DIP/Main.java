package principle.DIP;

/**
 * 依赖倒转原则:1.针对接口编程，而不要针对实现编程
 *
 * 依赖倒置原则的目的是通过要面向接口的编程来降低类间的耦合性，所以我们在实际编程中只要遵循以下4点，就能在项目中满足这个规则。
 * 1.每个类尽量提供接口或抽象类，或者两者都具备。
 * 2.变量的声明类型尽量是接口或者是抽象类。
 * 3.任何类都不应该从具体类派生。
 * 4.使用继承时尽量遵循里氏替换原则。
 */
public class Main {
    public static void main(String[] args) {
        Customer wang = new Customer();
        System.out.println("顾客购买以下商品：");
        wang.shopping(new ShopOne());
        wang.shopping(new ShopTwo());
        wang.shopping(new ShopThree());
    }
}

//商店
interface Shop{
    public String sell();
}
//网店1
class ShopOne implements Shop {
    public String sell() {
        return "土特产：香菇、木耳……";
    }
}
//网店2

class ShopTwo implements Shop {
    public String sell() {
        return "箱包类……";
    }
}
//网店3
class ShopThree implements Shop{

    @Override
    public String sell() {
        return "各种零食...";
    }
}

//顾客
class Customer {
    public void shopping(Shop shop) {
        System.out.println(shop.sell());//购物
    }
}

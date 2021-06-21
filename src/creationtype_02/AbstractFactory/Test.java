package creationtype_02.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        AbstractFactoryFarm abstractFactoryFarm = new ConcreteFactoryFarm();
        ProductAnimal productAnimal = abstractFactoryFarm.newAnimal();
        String name = productAnimal.setName("小狗");
        System.out.println("name = " + name);
        String show = productAnimal.show();
        System.out.println("show = " + show);


//        AbstractFactoryFarm abstractFactoryFarm;    //抽象的工厂，创建具体的农场
//        ProductAnimal productAnimal;    //抽象的产品，规范具体产品的创建
//        abstractFactoryFarm = new ConcreteFactoryFarm();
//        productAnimal = new ConcreteProductAnimal();
//        productAnimal.setName("小狗");
//        productAnimal.show();
    }
}

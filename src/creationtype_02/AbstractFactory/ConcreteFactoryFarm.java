package creationtype_02.AbstractFactory;

/**
 * 具体工厂
 * 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
 */
public class ConcreteFactoryFarm implements AbstractFactoryFarm {

    @Override
    public ProductAnimal newAnimal() {
        System.out.println("一个具体的农场==》生产动物");
        return new ConcreteProductAnimal();
    }

    @Override
    public ProductPlant newPlant() {
        System.out.println("一个具体的农场==》生产植物");
        return new ConcreatProductPlant();
    }
}

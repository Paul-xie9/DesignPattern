package creationtype.AbstractFactory;

/**
 * 一个产品等级，生产动物
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 */
public interface ProductAnimal {
    public String show();
    public String setName( String name);
}

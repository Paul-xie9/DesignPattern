package creationtype_02.AbstractFactory;

/**
 * 产品族，
 * 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
 */
public interface ProductPlant {
    public String show();
    public String setName(String name);
}

package creation_pattern_01.AbstractFactory;

/**
 * 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间是多对一的关系。
 */
public class ConcreatProductPlant implements ProductPlant{

    private String name;

    @Override
    public String show() {
        System.out.println("青草！");
        String plant = "植物";
        return plant;
    }

    @Override
    public String setName(String name) {
        name = this.name;
        return name;
    }
}

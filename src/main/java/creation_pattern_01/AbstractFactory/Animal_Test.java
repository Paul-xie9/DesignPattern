package creation_pattern_01.AbstractFactory;

/**
 * @module:
 * @title: Animal_Test
 * @description: 用抽象工厂模式设计农场类,农场中除了像畜牧场一样可以养动物，还可以培养植物，如养马、养牛、种菜、种水果等
 * @author: xbc
 * @date 2022年01月12日 16:32
 */
public class Animal_Test {
    public static void main(String[] args) {
        PaulFarm farm = new PaulFarm();
        farm.createAnimal().show();
        farm.createPlant().show();
    }
}
interface Animal{//动物类
    void show();
}
class Horse implements Animal{
    @Override
    public void show() {
        System.out.println("Horse = 马");
    }
}
class Cattle implements Animal{
    @Override
    public void show() {
        System.out.println("Cattle = 牛");
    }
}
interface Plant{//植物类
    void show();
}
class Vegetables implements Plant{
    @Override
    public void show() {
        System.out.println("Vegetables = 蔬菜");
    }
}
class Apple implements Plant{
    @Override
    public void show() {
        System.out.println("Apple = 苹果");
    }
}
interface FarmFactory{
    Animal createAnimal();
    Plant createPlant();
}
class PaulFarm implements FarmFactory{
    @Override
    public Animal createAnimal() {
        return new Cattle();
    }
    @Override
    public Plant createPlant() {
        return new Vegetables();
    }
}
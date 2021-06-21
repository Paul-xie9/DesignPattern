package creationtype_02.AbstractFactory;

public class ConcreteProductAnimal implements ProductAnimal{

    private String name;
    @Override
    public String show() {
        String animal = "具体的产品==》动物";
        return animal;
    }

    @Override
    public String setName(String name) {
        this.name=name;
        return name;
    }
}

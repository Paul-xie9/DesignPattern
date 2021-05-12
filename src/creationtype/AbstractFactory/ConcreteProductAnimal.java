package creationtype.AbstractFactory;

public class ConcreteProductAnimal implements ProductAnimal{

    private String name;
    @Override
    public String show() {
        return "001";
    }

    @Override
    public String setName(String name) {
        this.name=name;
        return name;
    }
}

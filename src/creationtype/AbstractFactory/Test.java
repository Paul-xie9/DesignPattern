package creationtype.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        ConcreteProductAnimal animal = new ConcreteProductAnimal();
        animal.setName("donkey");
        new ConcreteProductAnimal().setName("Monkey --> 猴");

        System.out.println("---------------------------");
        ConcreatProductPlant plant = new ConcreatProductPlant();
        plant.show();
        plant.setName("2222");
    }
}

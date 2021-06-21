package creationtype_02.Builder;

public class ParlourDecorator {
    public static void main(String[] args) {
        Decorator decorator = new ConcreteDecorator1();
        ProjectManager projectManager = new ProjectManager(decorator);
        Parlour decorate = projectManager.decorate();
        decorate.show();
    }
}

//产品：客厅
class Parlour {
    private String wall;    //墙
    private String TV;    //电视
    private String sofa;    //沙发

    public void setWall(String wall) {
        this.wall = wall;
    }

    public void setTV(String TV) {
        this.TV = TV;
    }

    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    public void show() {
        System.out.println("wall = " + wall);
        System.out.println("TV = " + TV);
        System.out.println("sofa = " + sofa);
    }
}

//抽象建造者：装修工人
abstract class Decorator {
    //创建产品对象
    protected Parlour product = new Parlour();
    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}

//具体建造者：具体装修工人1
class ConcreteDecorator1 extends Decorator {
    public void buildWall() {
        product.setWall("w1");
    }
    public void buildTV() {
        product.setTV("TV1");
    }
    public void buildSofa() {
        product.setSofa("sf1");
    }
}

//具体建造者：具体装修工人2
class ConcreteDecorator2 extends Decorator {
    public void buildWall() {
        product.setWall("w2");
    }
    public void buildTV() {
        product.setTV("TV2");
    }
    public void buildSofa() {
        product.setSofa("sf2");
    }
}

//指挥者：项目经理
class ProjectManager {
    private Decorator builder;
    public ProjectManager(Decorator builder) {
        this.builder = builder;
    }
    //产品构建与组装方法
    public Parlour decorate() {
        builder.buildWall();
        builder.buildTV();
        builder.buildSofa();
        return builder.getResult();
    }
}
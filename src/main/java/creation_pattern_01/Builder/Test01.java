package creation_pattern_01.Builder;

import lombok.Data;
import principle.CRP.Main;

/**
 * @module:
 * @title: Test01
 * @description: TODO
 * @author: xbc
 * @date 2022年01月13日 19:35
 */
public class Test01 {
    public static void main(String[] args) {
        ConBuild conBuild = new ConBuild();
        Direct direct = new Direct(conBuild);
        System.out.println("direct.createHome().toString() = " + direct.createHome().toString());
    }
}
@Data
class Home  {
    private String name;
    private String type;
    private String height;
}
abstract class Builder01{
    protected Home home = new Home();
    abstract void buildName();
    abstract void buildType();
    abstract void buildHeight();
    Home getHome(){
        return home;
    }
}
class ConBuild extends Builder01{
    @Override
    void buildName() {
        home.setName("复式小洋楼");
    }
    @Override
    void buildType() {
        home.setType("欧美风");
    }
    @Override
    void buildHeight() {
        home.setHeight("小三层");
    }
}
class Direct{
    private Builder01 builder01;
    public Direct(Builder01 builder01){
        this.builder01=builder01;
    }
    public Home createHome(){
        builder01.buildName();
        builder01.buildType();
        builder01.buildHeight();
        return builder01.getHome();
    }
}
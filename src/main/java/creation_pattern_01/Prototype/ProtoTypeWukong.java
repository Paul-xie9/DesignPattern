package creation_pattern_01.Prototype;

public class ProtoTypeWukong {
    public static void main(String[] args) {
        SunWuKong wuKong = new SunWuKong();
        System.out.println(wuKong.name);
        SunWuKong sunWuKong = (SunWuKong) wuKong.clone();
        System.out.println(sunWuKong.name);
    }
}

//具体原型
class SunWuKong implements Cloneable {
    private static final long serialVersionUID = 5543049531872119328L;
    String name = "孙悟空";
    public SunWuKong() {
        System.out.println("这是孙悟空！");
    }

    public Object clone() {
        SunWuKong wuKong = null;
        try {
            wuKong = (SunWuKong) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.out.println("悟空克隆失败！");
        }
        return wuKong;
    }
}

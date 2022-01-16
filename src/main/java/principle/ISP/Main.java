package principle.ISP;

/**
 * 2002 年罗伯特·C.马丁给“接口隔离原则”的定义是：客户端不应该被迫依赖于它不使用的方法（Clients should not be forced to depend on methods they do not use）。
 * 该原则还有另外一个定义：一个类对另一个类的依赖应该建立在最小的接口上（The dependency of one class to another one should depend on the smallest
 * possible interface）。
 *
 * 以上两个定义的含义是：要为各个类建立它们需要的专用接口，而不要试图去建立一个很庞大的接口供所有依赖它的类去调用。
 *
 * 在具体应用接口隔离原则时，应该根据以下几个规则来衡量。
 * 接口尽量小，但是要有限度。一个接口只服务于一个子模块或业务逻辑。
 * 为依赖接口的类定制服务。只提供调用者需要的方法，屏蔽不需要的方法。
 * 了解环境，拒绝盲从。每个项目或产品都有选定的环境因素，环境不同，接口拆分的标准就不同深入了解业务逻辑。
 * 提高内聚，减少对外交互。使接口用最少的方法去完成最多的事情。
 */
public class Main {
    public static void main(String[] args) {
        InputModule input = StuScoreList.getInputModule();
        CountModule count = StuScoreList.getCountModule();
        PrintModule print = StuScoreList.getPrintModule();
        input.insert();
        input.delete();
        count.countTotalScore();
        print.printStuInfo();
        //print.delete();
    }
}
//输入模块接口
interface InputModule {
    void insert();
    void delete();
    void modify();
}
//统计模块接口
interface CountModule {
    void countTotalScore();
    void countAverage();
}
//打印模块接口
interface PrintModule {
    void printStuInfo();
    void queryStuInfo();
}
//实现类
class StuScoreList implements InputModule, CountModule, PrintModule {
    private StuScoreList() {
    }
    public static InputModule getInputModule() {
        return (InputModule) new StuScoreList();
    }
    public static CountModule getCountModule() {
        return (CountModule) new StuScoreList();
    }
    public static PrintModule getPrintModule() {
        return (PrintModule) new StuScoreList();
    }
    public void insert() {
        System.out.println("输入模块的insert()方法被调用！");
    }
    public void delete() {
        System.out.println("输入模块的delete()方法被调用！");
    }
    public void modify() {
        System.out.println("输入模块的modify()方法被调用！");
    }
    public void countTotalScore() {
        System.out.println("统计模块的countTotalScore()方法被调用！");
    }
    public void countAverage() {
        System.out.println("统计模块的countAverage()方法被调用！");
    }
    public void printStuInfo() {
        System.out.println("打印模块的printStuInfo()方法被调用！");
    }
    public void queryStuInfo() {
        System.out.println("打印模块的queryStuInfo()方法被调用！");
    }
}
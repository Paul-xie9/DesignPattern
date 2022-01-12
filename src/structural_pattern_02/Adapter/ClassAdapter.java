package structural_pattern_02.Adapter;

/**
 * 类适配器模式
 */
public class ClassAdapter {
    public static void main(String[] args)
    {
        System.out.println("类适配器模式测试：");
        Target target = new Adapterclass();
        target.request();
    }
}

//目标接口
interface Target
{
    public void request();
}

//适配者接口
class Adaptee
{
    public void specificRequest()
    {
        System.out.println("适配者中的业务代码被调用！");
    }
}

//类适配器类
class Adapterclass extends Adaptee implements Target
{
    public void request()
    {
        specificRequest();
    }
}

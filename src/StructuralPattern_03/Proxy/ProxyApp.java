package StructuralPattern_03.Proxy;

/**
 * 【例1】韶关“天街e角”公司是一家婺源特产公司的代理公司，用代理模式实现。
 *
 * 分析：本实例中的“婺源特产公司”经营许多婺源特产，它是真实主题，提供了显示特产的 display() 方法。
 *      而韶关“天街e角”公司是婺源特产公司特产的代理，通过调用婺源特产公司的 display() 方法显示代理产品，
 *      当然它可以增加一些额外的处理，如包裝或加价等。客户可通过“天街e角”代理公司间接访问“婺源特产公司”的产品。
 */
public class ProxyApp {
    public static void main(String[] args) {
        SGProxy sgProxy = new SGProxy();
        sgProxy.display();
    }
}

//1.抽象主题
interface AbstractSubject{
    void display();
}

//2.真实的主题
class realSubject implements AbstractSubject{

    @Override
    public void display() {
        System.out.println("真实的主题，韶关“天街e角”公司显示产品。");
    }
}

//3.代理
class SGProxy implements AbstractSubject{
    private realSubject real = new realSubject();

    @Override
    public void display() {
        preRequest();
        real.display();
        postRequest();
    }

    public void preRequest(){
        System.out.println("代理开始...");
    }

    public void postRequest(){
        System.out.println("代理结束...");
    }
}


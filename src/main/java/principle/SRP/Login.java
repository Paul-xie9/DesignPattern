package principle.SRP;

public class Login {
    public Login() {
        UserDao userDao = new UserDao();
        userDao.findUser();
        inti();
        display();
        volidate();
    }

    public void inti(){
        System.out.println("初始化...");
    }
    public void display(){
        System.out.println("显示页面...");
    }
    public void volidate(){
        System.out.println("处理事件...");
    }
}

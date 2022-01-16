package principle.SRP;

public class UserDao {
    public UserDao() {
        DBUtil dbUtil = new DBUtil();
        dbUtil.getConnection();
    }
    public void findUser(){
        System.out.println("userDAO...");
    }
}

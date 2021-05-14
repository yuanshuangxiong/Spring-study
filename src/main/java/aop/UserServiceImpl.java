package aop;

public class UserServiceImpl implements UserService{

    @Override
    public void add() {
        System.out.println("添加用户");
    }

    @Override
    public void delete() {
        System.out.println("删除用户");
    }

    @Override
    public void update() {
        System.out.println("修改用户信息");
    }

    @Override
    public void query() {
        System.out.println("查询用户");
    }
}

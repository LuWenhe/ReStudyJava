package edu.just.clone;

public class Test3 {
    public static void main(String[] args) {
        User[] users = new User[] {
                new User(1,"CC","CC@qq.com"),
                new User(2,"AA","AA@qq.com"),
                new User(2,"EE","EE@qq.com"),
        };

        User[] target = new User[users.length];

        System.arraycopy(users,0, target,0,users.length);

        System.out.println("源对象与目标对象物理地址是否一致：" + (users[0] == target[0]));

        target[0].setEmail("admin@qq.com");

        System.out.println("修改目标对象的属性值后源对象users：");
        for(User user: users) {
            System.out.println(user);
        }
    }
}

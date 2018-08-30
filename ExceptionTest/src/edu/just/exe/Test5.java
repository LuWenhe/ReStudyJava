package edu.just.exe;

import java.sql.SQLException;

class AA {
    //检查异常，编译时异常
    public void method() throws SQLException {

    }
}

class BB extends AA {
    //非检查时异常
    @Override
    public void method() throws NullPointerException {

    }
}

public class Test5 extends AA{

}

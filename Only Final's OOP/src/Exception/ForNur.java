package Exception;

import java.sql.SQLException;

public class ForNur {
    void m()throws NullPointerException{
        throw new NullPointerException("This is a null Exception");
    }
    public static void main(String[] args)throws SQLException {
        ForNur f=new ForNur();
        f.m();
    }
}

package Exception;

import java.io.IOException;

public class ThrowsTest {
    public void m() throws IOException{
        throw new IOException("device error");
    }
    public void n() throws IOException{
        m();
    }
    public void c()throws IOException{
        try {
            n();
        }
        catch (IOException e){
            System.out.println("Handled");
        }
    }
    public static void main(String[] args) throws IOException {
        ThrowsTest p= new ThrowsTest();
        p.c();
    }
}

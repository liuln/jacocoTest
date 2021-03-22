package rhtect.com;
import org.testng.annotations.Test;

public class MyTest {

    MyFunction fun = new MyFunction();

    @Test(priority = 1)
    public void test1() {
        fun.getMyBoolean();
        System.out.println("MyTest-----test1");
    }

    @Test(priority = 2)
    public void test2() {
        fun.isMan("");
        fun.isMan("aa");
        System.out.println("MyTest-----test2");
    }
}

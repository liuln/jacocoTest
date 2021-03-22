package rhtect.com;
import org.testng.annotations.Test;

public class MyTest2 {

    rhtect.com.MyFunction fun = new rhtect.com.MyFunction();

    @Test
    public void test1() {
        fun.getMyBoolean();
        System.out.println("MyTest2-----test1");
    }

    @Test
    public void test2() {
        fun.isMan("");
        System.out.println("MyTest2-----test2");
    }
}

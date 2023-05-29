import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void Testadd() {
        System.out.println("test1");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(10, 20);
//        验证10+20是不是30，junit提供的方法，对比结果的
//        assertequals(期望值，实际值)，如果两个值相等证明是正确的，不等就抛异常了，错误了
        Assert.assertEquals(30, res);
    }

    @Test
    public void Testadd2() {
        System.out.println("test2");
        HelloMaven helloMaven = new HelloMaven();
        int res = helloMaven.add(11, 20);
//        验证10+20是不是30，junit提供的方法，对比结果的
//        assertequals(期望值，实际值)，如果两个值相等证明是正确的，不等就抛异常了，错误了
        Assert.assertEquals(31, res);
    }
}

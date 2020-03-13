import org.junit.Assert;
import org.junit.Test;

public class HelloWorldAddTest {

    @Test
    public void firstTest(){
        HelloWorld have = new HelloWorld("HeoWorld");
        String want = HelloWorld.returnString("HelloWorld");
        Assert.assertEquals(have.getString(), want);
    }

    @Test
    public void secondTest(){
        HelloWorld have = new HelloWorld("HelloWorld");
        String want = HelloWorld.returnString("HelloWorld");
        Assert.assertEquals(have.getString(), want);
    }

}

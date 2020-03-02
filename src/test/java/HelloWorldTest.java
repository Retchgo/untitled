import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void firstTest(){
        HelloWorld have = new HelloWorld("Hello");
        String want = HelloWorld.returnString("HelloWorld");
        Assert.assertEquals(have.getString(), want);
    }

}

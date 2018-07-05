import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametersTest {

    @Test
    @Parameters({"name","age"})
    public void tty(String name,int age){
        System.out.println(name+" is "+age);
    }
}

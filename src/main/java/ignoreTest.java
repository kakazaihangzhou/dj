import org.testng.annotations.Test;

public class ignoreTest {

    @Test
    public void ig1(){
        System.out.println("1");
    }

    @Test(enabled = false)
    public void ig2(){
        System.out.println("2");
    }

    @Test
    public void ig3(){
        System.out.println("3");
    }
}

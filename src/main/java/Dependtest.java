import org.testng.annotations.Test;

public class Dependtest {

    @Test
    public void test1(){
        System.out.println("1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = "test1")
    public void test2(){
        System.out.println("1执行2执行，1失败不执行");
    }
}

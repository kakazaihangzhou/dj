import org.testng.annotations.*;

public class forTest {

    @Test
    public void testng(){
        System.out.println("第一个方法");
    }
    @BeforeMethod
    public void testng1(){
        System.out.println("before method");

    }
    @AfterMethod
//    before 和 after在每一个方法运行前都要运行一次
    public void testng2(){
        System.out.println("after method");
    }
    @Test
//    可以单独执行一次
    public void testng3(){
        System.out.println("第二个方法");
    }

    @Test
    public void testng4(){
        System.out.println("第三个方法");
    }

    @BeforeClass
    public void testng5(){
        System.out.println("before class");
    }
//    类执行之前之后运行的方法

    @AfterClass
    public void testng6(){
        System.out.println("after class");
    }

    @BeforeSuite
    public void testng7(){
        System.out.println("before suite");
    }

    @AfterSuite
    public void testng8(){
        System.out.println("after suite");
    }
}
//https://www.cnblogs.com/qiaoyeye/p/5317566.html
//@BeforeSuite->@BeforeTest->@BeforeClass->{@BeforeMethod->@Test->@AfterMethod}->@AfterClass->@AfterTest->@AfterSuite
//其中{}内的与多少个@Test，就循环执行多少次
//看到没有，除了@BeforeSuite、@BeforeTest、@AfterTest、
//@AfterSuite可以对不同的测试类生效外，
//        其他的注解的作用范围只在本类中生效。
//        这样就可以清晰的知道什么样的逻辑应该放在哪个注解中
//        ，如只想在测试中只启动、关闭一次浏览器，
//        且再不同的测试类中共用，那么我们就可以把启动
//        、关闭浏览器的方法放在suite和test中
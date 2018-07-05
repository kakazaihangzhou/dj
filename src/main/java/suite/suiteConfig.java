package suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class suiteConfig {

    @BeforeSuite
    public void beforesuite(){
        System.out.println("before suite");
    }
    @AfterSuite
    public void aftersuite(){
        System.out.println("after suite ");
    }

    @BeforeTest
    public void tt(){
        System.out.println("before test");
    }
    @AfterTest
    public void ttt(){
        System.out.println("after test");
    }

}

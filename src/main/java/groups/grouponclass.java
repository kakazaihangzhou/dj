package groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class grouponclass {

    @Test(groups = "sever")
    public void test1(){
        System.out.println("sever1");
    }

    @Test(groups = "sever")
    public void test2(){
        System.out.println("sever2");
    }
    @Test(groups = "client")
    public void test3(){
        System.out.println("client1");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("client2");
    }

    @BeforeGroups("sever")
    public void test22(){
        System.out.println("sever 前");
    }

    @AfterGroups("sever")
    public void test23(){
        System.out.println("sever 后");
    }
}

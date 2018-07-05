import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProviderTest {


    @Test(dataProvider = "t1")
    public void ttyu(String name, int age) {
        System.out.println(name + " is " + age);
    }

    @DataProvider(name = "t1")
    public Object[][] ttdt() {
        Object[][] o = new Object[][]{
                {"zhangsan", 12}, {"lisi", 13}, {"wangwu", 30}
        };
        return o;
    }

    @Test(dataProvider = "hellokitty")
    public void test1(String name, int age) {
        System.out.println(name + " is " + age);
    }

    @Test(dataProvider = "hellokitty")
    public void test2(String name, int age) {
        System.out.println(name + " is " + age);
    }

    @Test(dataProvider = "hellokitty")
    public void test3(String name, int age) {
        System.out.println(name + " is " + age);
    }


    @Test
    @DataProvider(name="hellokitty")
    public Object[][] ttyy(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"zhangsan", 90}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"lisi", 91}
            };
        } else {
            result = new Object[][]{
                    {"wangwu", 93}
            };
        }

        return result;
    }


}

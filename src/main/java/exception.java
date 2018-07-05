import org.testng.annotations.Test;

//预期失败的异常测试
public class exception {

    @Test(expectedExceptions = RuntimeException.class)
//        前面是固定写法
    public void runTimeExceptionFailed(){
       System.out.println("it is failed");
    }

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimesuccess(){
        System.out.println("it is success");
        throw new RuntimeException();
    }
}

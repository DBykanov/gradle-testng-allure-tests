package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckGroupTests {


    @Test(groups = { "smoke" })
    public void checkGroup1(){
        System.out.println("executing smoke group test");
    }

    @Test(groups = { "regression" })
    public void checkGroup2(){
        System.out.println("executing regression group test");
    //    Assert.fail();
    }
}

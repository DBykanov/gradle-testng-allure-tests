package tests;

import CalcSteps.CalcSteps;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.RetryAnalyzer;

public class TestNGTestsGlobalRetry {


    //тест в котором пробую retryAnalyzer
    public int a = 0;
    @Test(/*groups = {"sum1"}*/)
    public void sumTest(){
        CalcSteps calcSteps = new CalcSteps();
        System.out.println("starting");
        a++;
        if(a!=1 && a!=2 && a!=3 && a!=4){
            Assert.assertTrue(calcSteps.isPositive(10));
        } else Assert.fail("fail for retry");
    }
}

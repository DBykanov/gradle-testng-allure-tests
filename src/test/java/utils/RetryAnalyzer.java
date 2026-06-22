package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

    private final int MAX_COUNT = 3;
    private int count = 0;

    @Override
    public boolean retry(ITestResult result) {
        if(count < MAX_COUNT){
            count++;
            return true;
        } else
            return false;
    }
}

package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

/**
 * The RetryAnalyzer purpose is to rerun failed test cases again.
 **/
public class RetryAnalyzer implements IRetryAnalyzer {
    int counter = 0;
    int retryLimit = 1;

    public boolean retry(ITestResult result) {
        if(counter < retryLimit) {
            counter++;
            return true;
        }
        return false;
    }
}

package BsaNhs_Helper;


import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import baseUtility.baseClass;

public class listeners implements ITestListener {

    baseClass b = new baseClass();

    public void onFinish(ITestContext arg0) {
        // TODO Auto-generated method stub
        //hey i am done
    }

    public void onStart(ITestContext arg0) {
        // TODO Auto-generated method stub
        //
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
        // TODO Auto-generated method stub

    }


    public void onTestSkipped(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestStart(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    public void onTestSuccess(ITestResult arg0) {
        // TODO Auto-generated method stub

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

}

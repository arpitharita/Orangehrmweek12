package com.orangehrm.testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGSoftAssert {
    @Test
    public void testSum() {
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.println("Running test");
        Assert.assertTrue(sum==11);
        System.out.println("line after 1st assert");
        Assert.assertTrue(sum==15);// assertion fail, condition not satisfied
        System.out.println("line after 2nd assert");

    }
    @Test
    public void testSum1() {
        SoftAssert softAssert=new SoftAssert();
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.println("Running test");
        softAssert.assertTrue(sum==11);
        System.out.println("line after 1st assert");
        softAssert.assertTrue(sum==15);
        System.out.println("line after 2nd assert");
        softAssert.assertAll();
    }

}

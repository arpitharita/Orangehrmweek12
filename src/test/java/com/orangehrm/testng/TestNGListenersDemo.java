package com.orangehrm.testng;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

//@Listeners(TestNGListeners.class)//1st way of running
public class TestNGListenersDemo {
    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
        Assert.fail();
    }

    @Test
    public void test3(){
        System.out.println("test3");
       throw  new SkipException("test SKipped");
    }

}

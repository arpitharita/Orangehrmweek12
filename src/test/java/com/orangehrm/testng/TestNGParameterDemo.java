package com.orangehrm.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameterDemo {

@Test
@Parameters({"myName","surname"})
public void test(@Optional("Priyanka") String name,@Optional("patel") String surname){
    System.out.println("my name is : "+ name);
    System.out.println("my name is : "+ surname);
}
}

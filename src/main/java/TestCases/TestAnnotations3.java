package TestCases;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestAnnotations3 {

    //test case 1
    @Test
    public void testCase(){
        System.out.println("Test case 1");
    }
    @Test
    public void testCase2(){
        System.out.println("Test case 2");
    }
    @Before
    public void beforeMethod1(){
        System.out.println("Before method1");
    }
    @Before
    public void beforeMethod2(){
        System.out.println("Before method2");
    }
    @BeforeClass
    public static void beforeClass1(){
        System.out.println("Before class 1");
    }

    @BeforeClass
    public static void beforeClass2(){
        System.out.println("Before class 1");
    }

    @After
    public void AfterClass1(){
        System.out.println("After class 1");
    }
}

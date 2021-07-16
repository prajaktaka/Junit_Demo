package Junit_demo.Junit_demo;

import junit.framework.TestCase;

import org.junit.Test;

public class Junit_Demo extends TestCase {
	    @Test
	    public void test_JUnit() 
	    {
	        System.out.println("This is the testcase in this class");
	        String str1="This is the testcase in this class";
	        assertEquals("This is the testcase in this class", str1);
	    }
	
}

package com.hdfcbank.MavenDemo;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
        super( testName1 ); 
        super( testName2 );
        super( testName3 );
        
        super( testName4 );
        super( testName5 );
        super( testName6 );
        super( testName 7);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

	private void assertTrue(boolean b) {
		// TODO Auto-generated method stub
		
	}
}

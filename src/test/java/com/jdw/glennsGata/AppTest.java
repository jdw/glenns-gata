package com.jdw.glennsGata;

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
    public void test_board1() {
    	Board b = new Board();
        assertFalse(b.getRemainigDigits().contains('9'));
        assertFalse(b.getRemainigDigits().contains('4'));
        assertFalse(b.getRemainigDigits().contains('1'));
        
        assertTrue(b.getRemainigDigits().contains('8'));
        assertTrue(b.getRemainigDigits().contains('7'));
        assertTrue(b.getRemainigDigits().contains('6'));
        assertTrue(b.getRemainigDigits().contains('5'));
        assertTrue(b.getRemainigDigits().contains('3'));
        assertTrue(b.getRemainigDigits().contains('2'));
        
        assertTrue(b.setDigitAt(2, '2'));
        assertFalse(b.getRemainigDigits().contains('2'));
        
        assertFalse(b.setDigitAt(1, '2'));
        assertFalse(b.setDigitAt(0, '6'));
    }
    
    
    public void test_board2() {
    	Board b1 = new Board();
    	Board b2 = new Board();
    	
    	assertTrue(b1.equals(b2));
    	
    	assertTrue(b1.setDigitAt(2, '2'));
    	assertFalse(b1.equals(b2));
    	
    	assertTrue(b1.removeDigitAt(2));
    	assertTrue(b1.equals(b2));
    }
    
    
    public void test_board3() {
    	Board b1 = new Board();
    	assertFalse(b1.testBoard());
    }
    
    
    public void test_board4() {
    	Board b = new Board();
        assertFalse(b.getRemainigPositions().contains(0));
        assertFalse(b.getRemainigPositions().contains(4));
        assertFalse(b.getRemainigPositions().contains(8));
        
        assertTrue(b.getRemainigPositions().contains(1));
        assertTrue(b.getRemainigPositions().contains(2));
        assertTrue(b.getRemainigPositions().contains(3));
        assertTrue(b.getRemainigPositions().contains(5));
        assertTrue(b.getRemainigPositions().contains(6));
        assertTrue(b.getRemainigPositions().contains(7));
        
        assertTrue(b.setDigitAt(2, '2'));
        assertFalse(b.getRemainigPositions().contains(2));
    }
    
    
    public void test_board5() {
    	Board b1 = new Board();
    	
    	assertTrue(b1.setDigitAt(2, '2'));
    	assertFalse(b1.getRemainigDigits().contains('2'));
    	assertTrue(b1.removeDigitAt(2));
    	assertTrue(b1.getRemainigDigits().contains('2'));
    }
}

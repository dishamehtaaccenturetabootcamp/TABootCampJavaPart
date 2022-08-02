package com.bootcampexcercise.module10.activity;

import junit.framework.TestCase;

/**
 * @author disha.k.mehta
 * Activity3
 */
public class CalculatorTest extends TestCase {

    private Calculator calculator;

    protected void setUp() throws Exception {
        super.setUp();
        //	Initialize variables to be used here
        calculator = new Calculator();
    }

    protected void tearDown() throws Exception {
        calculator = null;
        super.tearDown();
    }

    // 4 test cases of add
    public void testAdd1() {
        int addResult = calculator.add(7, 9);
        assertEquals(16, addResult);
    }

    public void testAdd2() {
        int addResult = calculator.add(7, 9, 8);
        assertEquals(24, addResult);
    }

    public void testAdd3() {
        int addResult = calculator.add(-7, -9);
        assertEquals(-16, addResult);
    }

    public void testAdd4() {
        int addResult = calculator.add(-7, -9, 8);
        assertEquals(-8, addResult);
    }

    // 2 test cases of subtract

    public void testSubtract1() {
        int subResult = calculator.subtract(8, 5);
        assertEquals(3, subResult);
    }

    public void testSubtract2() {
        int subResult = calculator.subtract(-8, 0);
        assertEquals(-8, subResult);
    }

    // 3 test cases of multiply
    public void testMultiple1() {
        double mulResult = calculator.multiply(0, 6);
        assertEquals(0.0, mulResult);
    }

    public void testMultiple2() {
        double mulResult = calculator.multiply(-6, 6);
        assertEquals(-36.0, mulResult);
    }

    public void testMultiple3() {
        double mulResult = calculator.multiply(6, 6);
        assertEquals(36.0, mulResult);
    }

    // 2 test cases of divide

    public void testDivide1() {
        double divResult = calculator.divide(6, 0);
        assertEquals(0.0, divResult);
    }

    public void testDivide2() {
        double divResult = calculator.divide(-6, 6);
        assertEquals(-1.0, divResult);
    }

    // Output
//    100% test coverage of Calculator class
//    Output Terminal
//                    Invalid input
//                    Invalid input in divide


}

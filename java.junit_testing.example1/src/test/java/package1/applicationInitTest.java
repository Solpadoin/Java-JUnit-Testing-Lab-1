package package1;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import package1.controller.Calculating;

import static org.junit.jupiter.api.Assertions.*;

class applicationInitTest {

    applicationInitTest() {
        //timeout = new Timeout(1000);
    }

    public void testAdd()
    {
        Calculating calculateTest = new Calculating();
        calculateTest.add(5, 10);
        assertEquals(15, calculateTest.getResult(), 1);
    }

    public void testMult()
    {
        Calculating calculateTest = new Calculating();
        calculateTest.mult(5, 0); // div to 0 -- should return -1 as invalid operation
        assertEquals(-1, calculateTest.getResult(), 1);
    }

    public void testDiv()
    {
        Calculating calculateTest = new Calculating();
        calculateTest.div(5, 10);
        assertEquals(0.5, calculateTest.getResult(), 1);
    }

    public void testSub()
    {
        Calculating calculateTest = new Calculating();
        calculateTest.sub(5, 10);
        assertEquals(-5, calculateTest.getResult(), 1);
    }

    public void testSqrt()
    {
        Calculating calculateTest = new Calculating();
        calculateTest.sqrt(9);
        assertEquals(3, calculateTest.getResult(), 1);
    }

    public void testPow()
    {
        Calculating calculateTest = new Calculating();
        calculateTest.pow(9, 2);
        assertEquals(81, calculateTest.getResult(), 1);
    }

     /**
     * If true, forces auto test to failure status
     * */
    public boolean triggerTestFailure(boolean status)
    {
        if (status)
            assertEquals(1, 0, 0);

        return status;
    }

     /**
     * 'Before'
     *
     * */
    public Calculating getCalculateHandle()
    {
        return new Calculating();
    }

     /**
     * 'After'
     *
     * */
    public void destroyCalculateObject(Calculating obj)
    {
        if (obj != null)
        {
            obj = null;
            Runtime.getRuntime().gc();
        }
    }

    @Test
    public void SomeTest() {
        // to do
    }

    @Before
    public void doSomeBeforeFunc()
    {
    }

    @After
    public void doSomeAfterFunc()
    {
        System.out.println("<< JUnit : @After has been triggered!! >>");
    }

    @org.junit.jupiter.api.Test
    void main() {
        // testing //


        System.out.println("<< JUnit testing started! >>");

        testAdd();
        testMult();
        testDiv();
        testSub();
        testSqrt();
        testPow();

        assertEquals(0,  getCalculateHandle().getResult(), 0);

        if (triggerTestFailure(false)) // set to true if you want to fail the test!
            System.out.println("<< JUnit testing failed! >>");
        else
            System.out.println("<< JUnit testing successfully passed! >>");
    }
}
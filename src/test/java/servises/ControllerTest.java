package servises;

import module.Banks;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerTest {
    private Controller controller;
    @Before
    public void setUp() throws Exception {
        controller = new Controller();
    }

    @Test
    public void returnSwed() {
        controller.setPurchase("car") ;
        controller.setEarlyRepayment("yes");
        controller.setCreditLineIncrease("yes");

        Banks result = controller.getBank();
        assertEquals(Banks.SWED, result);
    }
    @Test
    public void returnSwedtoo() {
        controller.setPurchase("flat") ;
        controller.setEarlyRepayment("no");
        controller.setCreditLineIncrease("no");

        Banks result = controller.getBank();
        assertEquals(Banks.SWED, result);
    }
    @Test
    public void returnPriv() {
        controller.setPurchase("car") ;
        controller.setEarlyRepayment("no");
        controller.setCreditLineIncrease("yes");

        Banks result = controller.getBank();
        assertEquals(Banks.PRIVAT, result);
    }
    @Test
    public void returnPrivtoo() {
        controller.setPurchase("flat") ;
        controller.setEarlyRepayment("yes");
        controller.setCreditLineIncrease("no");

        Banks result = controller.getBank();
        assertEquals(Banks.PRIVAT, result);
    }
    @Test
    public void returnMono() {
        controller.setPurchase("car") ;
        controller.setEarlyRepayment("yes");
        controller.setCreditLineIncrease("no");

        Banks result = controller.getBank();
        assertEquals(Banks.MONO, result);
    }
    @Test
    public void returnMonotoo() {
        controller.setPurchase("flat") ;
        controller.setEarlyRepayment("no");
        controller.setCreditLineIncrease("yes");

        Banks result = controller.getBank();
        assertEquals(Banks.MONO, result);
    }
    @Test
    public void returnIbox() {
        controller.setPurchase("car") ;
        controller.setEarlyRepayment("no");
        controller.setCreditLineIncrease("no");

        Banks result = controller.getBank();
        assertEquals(Banks.IBOX, result);
    }
    @Test
    public void returnIboxtoo() {
        controller.setPurchase("flat") ;
        controller.setEarlyRepayment("yes");
        controller.setCreditLineIncrease("yes");

        Banks result = controller.getBank();
        assertEquals(Banks.IBOX, result);
    }
}
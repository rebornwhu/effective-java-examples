package test.com.xiaolu.item30enum;

import com.xiaolu.item30enum.PayrollDay;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * PayrollDay Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 29, 2015</pre>
 */
public class PayrollDayTest {

    /**
     * Method: pay(double hoursWorked, double payRate)
     */
    @Test
    public void testPayForHoursWorkedPayRate() throws Exception {
        PayrollDay payrollDay = PayrollDay.MONDAY;
        double mPay = payrollDay.pay(16, 36.6);
    }

    /**
     * Method: overtimePay(double hours, double payRate)
     */
    @Test
    public void testOvertimePay() throws Exception {

    }


}
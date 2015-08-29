package test.com.xiaolu.item30enum;

import com.xiaolu.item30enum.Operation;
import org.junit.Assert;
import org.junit.Test;

/**
 * Operation Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Aug 29, 2015</pre>
 */
public class OperationTest {

    /**
     * Method: fromString(String symbol)
     */
    @Test
    public void testFromString() throws Exception {
        Operation op = Operation.fromString("PLUS");
        Assert.assertEquals(Operation.PLUS, op);
    }


} 

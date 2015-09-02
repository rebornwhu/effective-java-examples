package com.xiaolu.item17_document_inheritance;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;

/**
 * Sub Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>Sep 1, 2015</pre>
 */
public class SubTest {

    /**
     * Method: overrideMe()
     */
    @Test
    public void testOverrideMe() throws Exception {
        Sub sub = new Sub();
        sub.overrideMe();
    }
}
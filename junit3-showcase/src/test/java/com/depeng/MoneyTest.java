package com.depeng;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Created by depeng on 23/3/14.
 */
public class MoneyTest extends TestCase {



    public void setUp() throws Exception {
        super.setUp();

    }

    public void tearDown() throws Exception {

    }

    public void testAmount() throws Exception {
        Money sd = new Money(100, "SD");
        assert sd.amount() == 1100;
    }

    public void testCurrency() throws Exception {

        Assert.assertEquals(1,2);
    }
}

package com.depeng;

import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Created by depeng on 25/3/14.
 */
public class PackageTestCases {
    public static Test onlyOne() {
        return new TestSuite(MathTest.class);
    }


    public static Test multiple() {
        TestSuite suite = new TestSuite("multiple tests");

        suite.addTestSuite(MathTest.class);
        suite.addTestSuite(MoneyTest.class);

        return suite;
    }

    public static void main(String args[]) {
        junit.textui.TestRunner.run(onlyOne());
        junit.textui.TestRunner.run(multiple());
    }
}

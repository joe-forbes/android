package edu.utexas.clee.jsf.android;

import org.junit.Assert;
import org.junit.Test;

/**
 * Simple JUnit 4 test class
 */
public class ScratchClassTest {

    @Test
    public void testScratch() throws Exception {
        ScratchClass scratchClass = new ScratchClass();
        Assert.assertEquals("edu.utexas.clee.jsf.android.ScratchClass", scratchClass.toString());
    }

}
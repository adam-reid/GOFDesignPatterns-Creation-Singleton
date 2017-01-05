package com.training.singleton;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Test the singleton.
 */
public class SingletonTest {
    @Test
    public void basicTest() {
        Singleton firstSingleton = Singleton.getInstance();
        Singleton secondSingleton = Singleton.getInstance();

        TestCase.assertEquals(firstSingleton.hashCode(),secondSingleton.hashCode());
    }

    @Test
    public void threadedTest() {
        //todo implement threading.
        TestCase.fail();
    }

    @Test
    public void tileTest() {
        //todo implement several instances.
        TestCase.fail();
    }

}

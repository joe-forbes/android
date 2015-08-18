package edu.utexas.clee.jsf.android;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by joe on 8/13/15.
 */
public class MainActivityInstrumentationTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityInstrumentationTest() {
        super(MainActivity.class);
    }

    public void testActivityExists() {
        MainActivity activity = getActivity();
        assertNotNull(activity);
    }

    public void testActivityTitle() {
        MainActivity activity = getActivity();
        assertEquals("Android Application", activity.getTitle());
    }

}
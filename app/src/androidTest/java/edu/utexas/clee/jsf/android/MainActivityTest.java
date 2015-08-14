package edu.utexas.clee.jsf.android;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by joe on 8/13/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest() {
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
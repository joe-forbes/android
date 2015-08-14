package edu.utexas.clee.jsf.android;

import android.test.ActivityInstrumentationTestCase2;

/**
 * Created by joe on 8/13/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {

    public MainActivityTest(Class<MainActivity> activityClass) {
        super(activityClass);
    }

    public void testPrerequisites() {
        MainActivity activity = getActivity();
        assertNotNull(activity);
    }
}
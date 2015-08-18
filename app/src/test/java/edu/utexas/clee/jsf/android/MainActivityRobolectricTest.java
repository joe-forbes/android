package edu.utexas.clee.jsf.android;

import android.app.Activity;
import android.view.Menu;

import junit.framework.Assert;

import edu.utexas.clee.jsf.android.BuildConfig;
import edu.utexas.clee.jsf.android.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricGradleTestRunner;
import org.robolectric.annotation.Config;

import static org.robolectric.Shadows.shadowOf;

/**
 * Tests for MainActivity using Robolectric.
 * As of 8/15/15, Robolectric does not support API level 22.
 * Created by joe on 8/15/15.
 */

@RunWith(RobolectricGradleTestRunner.class)
/* Note: package name needed for testing debug build; otherwise, has .debug suffix. */
@Config(packageName = "edu.utexas.clee.jsf.android", constants = BuildConfig.class)
public class MainActivityRobolectricTest {

    @Test
    public void onCreate_shouldInflateTheMenu() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        final Menu menu = shadowOf(activity).getOptionsMenu();
//        Assert.assertEquals("First menu item", menu.findItem(R.id.item1).getTitle());
    }


    @Test
    public void testApplicationTitle() throws Exception {
        Activity activity = Robolectric.setupActivity(MainActivity.class);

        Assert.assertEquals("Android Application", activity.getTitle());
    }
}

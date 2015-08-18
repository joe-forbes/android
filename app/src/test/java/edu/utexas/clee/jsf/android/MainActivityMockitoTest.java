package edu.utexas.clee.jsf.android;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.powermock.api.support.membermodification.MemberMatcher.method;
import static org.powermock.api.support.membermodification.MemberModifier.suppress;

/**
 * All Android system APIs required by these tests are mocked by hand.
 *
 * Based on:
 * https://github.com/vexdev/AndroidUnitTest/blob/master/app/src/test/java/com/example/android/testingfun/LaunchActivityTest.java
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest(MainActivity.class)
public class MainActivityMockitoTest {

    private MainActivity tested;

    @Mock
    private Button mockButton;

    @Before
    public void setUp() throws Exception {
        // We will Spy our tested activity so that we will be able to give it some input when
        //  for example the FindViewByID method is called.
        tested = spy(MainActivity.class);
        doReturn(mockButton).when(tested).findViewById(anyInt());
        // We need to suppress methods from the Base Activity. This is why we need PowerMock, there
        //  are other ways but are more intrusive in our code.
        suppress(method(Activity.class, "onCreate", Bundle.class));
        suppress(method(Activity.class, "setContentView", int.class));
    }

    @Test
    public void testOnCreate() throws Exception {
        // When we call the onCreate...
        tested.onCreate(mock(Bundle.class));

        // TODO: figure out what I might want to test using Mockito rather than Robolectric.
        // It must be something that doesn't rely on any Android system APIs I can't mock myself,
        // which eliminates a lot of things one might test.

    }
}
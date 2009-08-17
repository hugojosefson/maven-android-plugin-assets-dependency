package com.jayway.maven.plugins.android.generation2.samples.assetsdependency;

import android.test.ActivityInstrumentationTestCase;

/**
 * This is a simple framework for a test of an Application.  See
 * {@link android.test.ApplicationTestCase ApplicationTestCase} for more information on
 * how to write and extend Application tests.
 * <p/>
 * To run this test, you can type:
 * adb shell am instrument -w \
 * -e class com.jayway.maven.plugins.android.generation2.samples.assetsdependency.MyActivityTest \
 * com.jayway.maven.plugins.android.generation2.samples.assetsdependency.tests/android.test.InstrumentationTestRunner
 */
public class MyActivityTest extends ActivityInstrumentationTestCase<MyActivity> {

    public MyActivityTest() {
        super("com.jayway.maven.plugins.android.generation2.samples.assetsdependency", MyActivity.class);
    }

}

package burrows.apps.example.template.activity;

import android.app.Activity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.android.controller.ActivityController;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Junit Test using Robolectric with AssertJ matchers.
 */
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Test
    public void testOnCreateNotNull() {
        ActivityController<MainActivity> controller = Robolectric.buildActivity(MainActivity.class);
        Activity activity = controller.create().destroy().get();

        assertThat(activity).isNotNull();
    }

}

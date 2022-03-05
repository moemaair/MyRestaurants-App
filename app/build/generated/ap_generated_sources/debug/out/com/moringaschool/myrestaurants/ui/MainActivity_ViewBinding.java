// Generated code from Butter Knife. Do not modify!
package com.moringaschool.myrestaurants.ui;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.myrestaurants.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding implements Unbinder {
  private MainActivity target;

  @UiThread
  public MainActivity_ViewBinding(MainActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public MainActivity_ViewBinding(MainActivity target, View source) {
    this.target = target;

    target.mFindRestaurantsButton = Utils.findRequiredViewAsType(source, R.id.findRestaurantsButton, "field 'mFindRestaurantsButton'", Button.class);
    target.mLocationEditText = Utils.findRequiredViewAsType(source, R.id.locationEditText, "field 'mLocationEditText'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    MainActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mFindRestaurantsButton = null;
    target.mLocationEditText = null;
  }
}

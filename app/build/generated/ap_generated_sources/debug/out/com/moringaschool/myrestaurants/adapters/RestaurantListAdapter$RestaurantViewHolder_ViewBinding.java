// Generated code from Butter Knife. Do not modify!
package com.moringaschool.myrestaurants.adapters;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.moringaschool.myrestaurants.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class RestaurantListAdapter$RestaurantViewHolder_ViewBinding implements Unbinder {
  private RestaurantListAdapter.RestaurantViewHolder target;

  @UiThread
  public RestaurantListAdapter$RestaurantViewHolder_ViewBinding(
      RestaurantListAdapter.RestaurantViewHolder target, View source) {
    this.target = target;

    target.mRestaurantImageView = Utils.findRequiredViewAsType(source, R.id.restaurantImageView, "field 'mRestaurantImageView'", ImageView.class);
    target.mNameTextView = Utils.findRequiredViewAsType(source, R.id.restaurantNameTextView, "field 'mNameTextView'", TextView.class);
    target.mCategoryTextView = Utils.findRequiredViewAsType(source, R.id.categoryTextView, "field 'mCategoryTextView'", TextView.class);
    target.mRatingTextView = Utils.findRequiredViewAsType(source, R.id.ratingTextView, "field 'mRatingTextView'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    RestaurantListAdapter.RestaurantViewHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRestaurantImageView = null;
    target.mNameTextView = null;
    target.mCategoryTextView = null;
    target.mRatingTextView = null;
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.managecasa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import androidx.viewpager2.widget.ViewPager2;
import com.example.managecasa.R;
import com.google.android.material.button.MaterialButton;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityOnboardingscreenBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final MaterialButton buttonOnboardingAction;

  @NonNull
  public final LinearLayout layoutOnboardingIndicators;

  @NonNull
  public final ViewPager2 onboardingViewPager;

  private ActivityOnboardingscreenBinding(@NonNull ConstraintLayout rootView,
      @NonNull MaterialButton buttonOnboardingAction,
      @NonNull LinearLayout layoutOnboardingIndicators, @NonNull ViewPager2 onboardingViewPager) {
    this.rootView = rootView;
    this.buttonOnboardingAction = buttonOnboardingAction;
    this.layoutOnboardingIndicators = layoutOnboardingIndicators;
    this.onboardingViewPager = onboardingViewPager;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityOnboardingscreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityOnboardingscreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_onboardingscreen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityOnboardingscreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.buttonOnboardingAction;
      MaterialButton buttonOnboardingAction = ViewBindings.findChildViewById(rootView, id);
      if (buttonOnboardingAction == null) {
        break missingId;
      }

      id = R.id.layoutOnboardingIndicators;
      LinearLayout layoutOnboardingIndicators = ViewBindings.findChildViewById(rootView, id);
      if (layoutOnboardingIndicators == null) {
        break missingId;
      }

      id = R.id.onboardingViewPager;
      ViewPager2 onboardingViewPager = ViewBindings.findChildViewById(rootView, id);
      if (onboardingViewPager == null) {
        break missingId;
      }

      return new ActivityOnboardingscreenBinding((ConstraintLayout) rootView,
          buttonOnboardingAction, layoutOnboardingIndicators, onboardingViewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

// Generated by view binder compiler. Do not edit!
package com.example.midmorningintents.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.midmorningintents.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button mBtnCamera;

  @NonNull
  public final Button mBtnEmail;

  @NonNull
  public final Button mBtnSms;

  @NonNull
  public final Button mbtnMpesa;

  @NonNull
  public final Button mbtncall;

  @NonNull
  public final Button mbtnmap;

  @NonNull
  public final Button mbtnshare;

  @NonNull
  public final Button mbtnwebsite;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button mBtnCamera,
      @NonNull Button mBtnEmail, @NonNull Button mBtnSms, @NonNull Button mbtnMpesa,
      @NonNull Button mbtncall, @NonNull Button mbtnmap, @NonNull Button mbtnshare,
      @NonNull Button mbtnwebsite) {
    this.rootView = rootView;
    this.mBtnCamera = mBtnCamera;
    this.mBtnEmail = mBtnEmail;
    this.mBtnSms = mBtnSms;
    this.mbtnMpesa = mbtnMpesa;
    this.mbtncall = mbtncall;
    this.mbtnmap = mbtnmap;
    this.mbtnshare = mbtnshare;
    this.mbtnwebsite = mbtnwebsite;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.mBtnCamera;
      Button mBtnCamera = ViewBindings.findChildViewById(rootView, id);
      if (mBtnCamera == null) {
        break missingId;
      }

      id = R.id.mBtnEmail;
      Button mBtnEmail = ViewBindings.findChildViewById(rootView, id);
      if (mBtnEmail == null) {
        break missingId;
      }

      id = R.id.mBtnSms;
      Button mBtnSms = ViewBindings.findChildViewById(rootView, id);
      if (mBtnSms == null) {
        break missingId;
      }

      id = R.id.mbtnMpesa;
      Button mbtnMpesa = ViewBindings.findChildViewById(rootView, id);
      if (mbtnMpesa == null) {
        break missingId;
      }

      id = R.id.mbtncall;
      Button mbtncall = ViewBindings.findChildViewById(rootView, id);
      if (mbtncall == null) {
        break missingId;
      }

      id = R.id.mbtnmap;
      Button mbtnmap = ViewBindings.findChildViewById(rootView, id);
      if (mbtnmap == null) {
        break missingId;
      }

      id = R.id.mbtnshare;
      Button mbtnshare = ViewBindings.findChildViewById(rootView, id);
      if (mbtnshare == null) {
        break missingId;
      }

      id = R.id.mbtnwebsite;
      Button mbtnwebsite = ViewBindings.findChildViewById(rootView, id);
      if (mbtnwebsite == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, mBtnCamera, mBtnEmail, mBtnSms,
          mbtnMpesa, mbtncall, mbtnmap, mbtnshare, mbtnwebsite);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

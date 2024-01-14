// Generated by view binder compiler. Do not edit!
package com.example.managecasa.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.managecasa.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class Singlerow1Binding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final TextView complaint;

  @NonNull
  public final TextView complaintxt;

  @NonNull
  public final ImageView delete;

  @NonNull
  public final TextView email;

  @NonNull
  public final TextView emailtext;

  @NonNull
  public final TextView name;

  @NonNull
  public final TextView nametext;

  @NonNull
  public final TextView phone;

  @NonNull
  public final TextView phonetxt;

  @NonNull
  public final TextView subject;

  @NonNull
  public final TextView subjecttxt;

  private Singlerow1Binding(@NonNull CardView rootView, @NonNull TextView complaint,
      @NonNull TextView complaintxt, @NonNull ImageView delete, @NonNull TextView email,
      @NonNull TextView emailtext, @NonNull TextView name, @NonNull TextView nametext,
      @NonNull TextView phone, @NonNull TextView phonetxt, @NonNull TextView subject,
      @NonNull TextView subjecttxt) {
    this.rootView = rootView;
    this.complaint = complaint;
    this.complaintxt = complaintxt;
    this.delete = delete;
    this.email = email;
    this.emailtext = emailtext;
    this.name = name;
    this.nametext = nametext;
    this.phone = phone;
    this.phonetxt = phonetxt;
    this.subject = subject;
    this.subjecttxt = subjecttxt;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static Singlerow1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static Singlerow1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.singlerow1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static Singlerow1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.complaint;
      TextView complaint = ViewBindings.findChildViewById(rootView, id);
      if (complaint == null) {
        break missingId;
      }

      id = R.id.complaintxt;
      TextView complaintxt = ViewBindings.findChildViewById(rootView, id);
      if (complaintxt == null) {
        break missingId;
      }

      id = R.id.delete;
      ImageView delete = ViewBindings.findChildViewById(rootView, id);
      if (delete == null) {
        break missingId;
      }

      id = R.id.email;
      TextView email = ViewBindings.findChildViewById(rootView, id);
      if (email == null) {
        break missingId;
      }

      id = R.id.emailtext;
      TextView emailtext = ViewBindings.findChildViewById(rootView, id);
      if (emailtext == null) {
        break missingId;
      }

      id = R.id.name;
      TextView name = ViewBindings.findChildViewById(rootView, id);
      if (name == null) {
        break missingId;
      }

      id = R.id.nametext;
      TextView nametext = ViewBindings.findChildViewById(rootView, id);
      if (nametext == null) {
        break missingId;
      }

      id = R.id.phone;
      TextView phone = ViewBindings.findChildViewById(rootView, id);
      if (phone == null) {
        break missingId;
      }

      id = R.id.phonetxt;
      TextView phonetxt = ViewBindings.findChildViewById(rootView, id);
      if (phonetxt == null) {
        break missingId;
      }

      id = R.id.subject;
      TextView subject = ViewBindings.findChildViewById(rootView, id);
      if (subject == null) {
        break missingId;
      }

      id = R.id.subjecttxt;
      TextView subjecttxt = ViewBindings.findChildViewById(rootView, id);
      if (subjecttxt == null) {
        break missingId;
      }

      return new Singlerow1Binding((CardView) rootView, complaint, complaintxt, delete, email,
          emailtext, name, nametext, phone, phonetxt, subject, subjecttxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}

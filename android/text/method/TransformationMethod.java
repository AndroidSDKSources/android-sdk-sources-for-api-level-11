package android.text.method;

import android.graphics.Rect;
import android.view.View;

public abstract interface TransformationMethod
{
  public abstract CharSequence getTransformation(CharSequence paramCharSequence, View paramView);

  public abstract void onFocusChanged(View paramView, CharSequence paramCharSequence, boolean paramBoolean, int paramInt, Rect paramRect);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.TransformationMethod
 * JD-Core Version:    0.6.0
 */
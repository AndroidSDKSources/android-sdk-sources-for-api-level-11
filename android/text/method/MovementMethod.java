package android.text.method;

import android.text.Spannable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.TextView;

public abstract interface MovementMethod
{
  public abstract void initialize(TextView paramTextView, Spannable paramSpannable);

  public abstract boolean onKeyDown(TextView paramTextView, Spannable paramSpannable, int paramInt, KeyEvent paramKeyEvent);

  public abstract boolean onKeyUp(TextView paramTextView, Spannable paramSpannable, int paramInt, KeyEvent paramKeyEvent);

  public abstract boolean onKeyOther(TextView paramTextView, Spannable paramSpannable, KeyEvent paramKeyEvent);

  public abstract void onTakeFocus(TextView paramTextView, Spannable paramSpannable, int paramInt);

  public abstract boolean onTrackballEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent);

  public abstract boolean onTouchEvent(TextView paramTextView, Spannable paramSpannable, MotionEvent paramMotionEvent);

  public abstract boolean canSelectArbitrarily();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.MovementMethod
 * JD-Core Version:    0.6.0
 */
package android.text.method;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.View;

public abstract interface KeyListener
{
  public abstract int getInputType();

  public abstract boolean onKeyDown(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent);

  public abstract boolean onKeyUp(View paramView, Editable paramEditable, int paramInt, KeyEvent paramKeyEvent);

  public abstract boolean onKeyOther(View paramView, Editable paramEditable, KeyEvent paramKeyEvent);

  public abstract void clearMetaKeyState(View paramView, Editable paramEditable, int paramInt);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.method.KeyListener
 * JD-Core Version:    0.6.0
 */
package android.view.inputmethod;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;

public abstract interface InputMethodSession
{
  public abstract void finishInput();

  public abstract void updateSelection(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);

  public abstract void updateCursor(Rect paramRect);

  public abstract void displayCompletions(CompletionInfo[] paramArrayOfCompletionInfo);

  public abstract void updateExtractedText(int paramInt, ExtractedText paramExtractedText);

  public abstract void dispatchKeyEvent(int paramInt, KeyEvent paramKeyEvent, EventCallback paramEventCallback);

  public abstract void dispatchTrackballEvent(int paramInt, MotionEvent paramMotionEvent, EventCallback paramEventCallback);

  public abstract void appPrivateCommand(String paramString, Bundle paramBundle);

  public abstract void toggleSoftInput(int paramInt1, int paramInt2);

  public static abstract interface EventCallback
  {
    public abstract void finishedEvent(int paramInt, boolean paramBoolean);
  }
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.inputmethod.InputMethodSession
 * JD-Core Version:    0.6.0
 */
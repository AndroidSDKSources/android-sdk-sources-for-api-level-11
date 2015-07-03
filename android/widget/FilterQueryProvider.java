package android.widget;

import android.database.Cursor;

public abstract interface FilterQueryProvider
{
  public abstract Cursor runQuery(CharSequence paramCharSequence);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.widget.FilterQueryProvider
 * JD-Core Version:    0.6.0
 */
package android.text;

public abstract interface SpanWatcher extends NoCopySpan
{
  public abstract void onSpanAdded(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2);

  public abstract void onSpanRemoved(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2);

  public abstract void onSpanChanged(Spannable paramSpannable, Object paramObject, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.SpanWatcher
 * JD-Core Version:    0.6.0
 */
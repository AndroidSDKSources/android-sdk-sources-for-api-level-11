package android.text;

public abstract interface TextWatcher extends NoCopySpan
{
  public abstract void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);

  public abstract void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3);

  public abstract void afterTextChanged(Editable paramEditable);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.text.TextWatcher
 * JD-Core Version:    0.6.0
 */
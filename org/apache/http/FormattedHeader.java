package org.apache.http;

import org.apache.http.util.CharArrayBuffer;

public abstract interface FormattedHeader extends Header
{
  public abstract CharArrayBuffer getBuffer();

  public abstract int getValuePos();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.FormattedHeader
 * JD-Core Version:    0.6.0
 */
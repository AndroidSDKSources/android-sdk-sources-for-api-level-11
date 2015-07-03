package org.apache.http;

public abstract interface StatusLine
{
  public abstract ProtocolVersion getProtocolVersion();

  public abstract int getStatusCode();

  public abstract String getReasonPhrase();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.StatusLine
 * JD-Core Version:    0.6.0
 */
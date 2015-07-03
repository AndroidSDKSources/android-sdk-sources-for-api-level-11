package org.apache.http;

public abstract interface RequestLine
{
  public abstract String getMethod();

  public abstract ProtocolVersion getProtocolVersion();

  public abstract String getUri();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.RequestLine
 * JD-Core Version:    0.6.0
 */
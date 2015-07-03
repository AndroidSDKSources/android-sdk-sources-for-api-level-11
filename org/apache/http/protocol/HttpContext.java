package org.apache.http.protocol;

public abstract interface HttpContext
{
  public static final String RESERVED_PREFIX = "http.";

  public abstract Object getAttribute(String paramString);

  public abstract void setAttribute(String paramString, Object paramObject);

  public abstract Object removeAttribute(String paramString);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.protocol.HttpContext
 * JD-Core Version:    0.6.0
 */
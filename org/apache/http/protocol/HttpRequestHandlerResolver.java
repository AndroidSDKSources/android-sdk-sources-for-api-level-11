package org.apache.http.protocol;

public abstract interface HttpRequestHandlerResolver
{
  public abstract HttpRequestHandler lookup(String paramString);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.protocol.HttpRequestHandlerResolver
 * JD-Core Version:    0.6.0
 */
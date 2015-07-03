package org.apache.http;

public abstract interface HttpEntityEnclosingRequest extends HttpRequest
{
  public abstract boolean expectContinue();

  public abstract void setEntity(HttpEntity paramHttpEntity);

  public abstract HttpEntity getEntity();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.HttpEntityEnclosingRequest
 * JD-Core Version:    0.6.0
 */
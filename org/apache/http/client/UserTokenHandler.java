package org.apache.http.client;

import org.apache.http.protocol.HttpContext;

public abstract interface UserTokenHandler
{
  public abstract Object getUserToken(HttpContext paramHttpContext);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.client.UserTokenHandler
 * JD-Core Version:    0.6.0
 */
package org.apache.http.protocol;

import java.util.List;
import org.apache.http.HttpRequestInterceptor;

public abstract interface HttpRequestInterceptorList
{
  public abstract void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor);

  public abstract void addRequestInterceptor(HttpRequestInterceptor paramHttpRequestInterceptor, int paramInt);

  public abstract int getRequestInterceptorCount();

  public abstract HttpRequestInterceptor getRequestInterceptor(int paramInt);

  public abstract void clearRequestInterceptors();

  public abstract void removeRequestInterceptorByClass(Class paramClass);

  public abstract void setInterceptors(List paramList);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.protocol.HttpRequestInterceptorList
 * JD-Core Version:    0.6.0
 */
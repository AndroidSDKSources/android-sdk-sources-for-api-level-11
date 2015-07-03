package org.apache.http.cookie;

import org.apache.http.params.HttpParams;

public abstract interface CookieSpecFactory
{
  public abstract CookieSpec newInstance(HttpParams paramHttpParams);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.cookie.CookieSpecFactory
 * JD-Core Version:    0.6.0
 */
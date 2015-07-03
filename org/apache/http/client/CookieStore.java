package org.apache.http.client;

import java.util.Date;
import java.util.List;
import org.apache.http.cookie.Cookie;

public abstract interface CookieStore
{
  public abstract void addCookie(Cookie paramCookie);

  public abstract List<Cookie> getCookies();

  public abstract boolean clearExpired(Date paramDate);

  public abstract void clear();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.client.CookieStore
 * JD-Core Version:    0.6.0
 */
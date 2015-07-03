package org.apache.http.cookie;

public abstract interface CookieAttributeHandler
{
  public abstract void parse(SetCookie paramSetCookie, String paramString)
    throws MalformedCookieException;

  public abstract void validate(Cookie paramCookie, CookieOrigin paramCookieOrigin)
    throws MalformedCookieException;

  public abstract boolean match(Cookie paramCookie, CookieOrigin paramCookieOrigin);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.cookie.CookieAttributeHandler
 * JD-Core Version:    0.6.0
 */
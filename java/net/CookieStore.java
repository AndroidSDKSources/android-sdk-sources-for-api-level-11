package java.net;

import java.util.List;

public abstract interface CookieStore
{
  public abstract void add(URI paramURI, HttpCookie paramHttpCookie);

  public abstract List<HttpCookie> get(URI paramURI);

  public abstract List<HttpCookie> getCookies();

  public abstract List<URI> getURIs();

  public abstract boolean remove(URI paramURI, HttpCookie paramHttpCookie);

  public abstract boolean removeAll();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.CookieStore
 * JD-Core Version:    0.6.0
 */
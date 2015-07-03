package javax.net.ssl;

import java.util.Enumeration;

public abstract interface SSLSessionContext
{
  public abstract Enumeration<byte[]> getIds();

  public abstract SSLSession getSession(byte[] paramArrayOfByte);

  public abstract int getSessionCacheSize();

  public abstract int getSessionTimeout();

  public abstract void setSessionCacheSize(int paramInt)
    throws IllegalArgumentException;

  public abstract void setSessionTimeout(int paramInt)
    throws IllegalArgumentException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLSessionContext
 * JD-Core Version:    0.6.0
 */
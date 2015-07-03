package org.apache.http.cookie;

import java.util.Date;

public abstract interface Cookie
{
  public abstract String getName();

  public abstract String getValue();

  public abstract String getComment();

  public abstract String getCommentURL();

  public abstract Date getExpiryDate();

  public abstract boolean isPersistent();

  public abstract String getDomain();

  public abstract String getPath();

  public abstract int[] getPorts();

  public abstract boolean isSecure();

  public abstract int getVersion();

  public abstract boolean isExpired(Date paramDate);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.cookie.Cookie
 * JD-Core Version:    0.6.0
 */
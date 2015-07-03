package org.apache.http.entity;

import org.apache.http.HttpException;
import org.apache.http.HttpMessage;

public abstract interface ContentLengthStrategy
{
  public static final int IDENTITY = -1;
  public static final int CHUNKED = -2;

  public abstract long determineLength(HttpMessage paramHttpMessage)
    throws HttpException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.entity.ContentLengthStrategy
 * JD-Core Version:    0.6.0
 */
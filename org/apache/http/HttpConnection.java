package org.apache.http;

import java.io.IOException;

public abstract interface HttpConnection
{
  public abstract void close()
    throws IOException;

  public abstract boolean isOpen();

  public abstract boolean isStale();

  public abstract void setSocketTimeout(int paramInt);

  public abstract int getSocketTimeout();

  public abstract void shutdown()
    throws IOException;

  public abstract HttpConnectionMetrics getMetrics();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.HttpConnection
 * JD-Core Version:    0.6.0
 */
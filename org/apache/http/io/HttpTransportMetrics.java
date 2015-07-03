package org.apache.http.io;

public abstract interface HttpTransportMetrics
{
  public abstract long getBytesTransferred();

  public abstract void reset();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.io.HttpTransportMetrics
 * JD-Core Version:    0.6.0
 */
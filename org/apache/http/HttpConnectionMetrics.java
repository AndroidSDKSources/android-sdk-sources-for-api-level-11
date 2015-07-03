package org.apache.http;

public abstract interface HttpConnectionMetrics
{
  public abstract long getRequestCount();

  public abstract long getResponseCount();

  public abstract long getSentBytesCount();

  public abstract long getReceivedBytesCount();

  public abstract Object getMetric(String paramString);

  public abstract void reset();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.HttpConnectionMetrics
 * JD-Core Version:    0.6.0
 */
package org.apache.http;

public abstract interface Header
{
  public abstract String getName();

  public abstract String getValue();

  public abstract HeaderElement[] getElements()
    throws ParseException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.Header
 * JD-Core Version:    0.6.0
 */
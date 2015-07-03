package org.apache.http;

public abstract interface HeaderElement
{
  public abstract String getName();

  public abstract String getValue();

  public abstract NameValuePair[] getParameters();

  public abstract NameValuePair getParameterByName(String paramString);

  public abstract int getParameterCount();

  public abstract NameValuePair getParameter(int paramInt);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.HeaderElement
 * JD-Core Version:    0.6.0
 */
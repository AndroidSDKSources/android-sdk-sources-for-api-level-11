package org.xml.sax;

public abstract interface Locator
{
  public abstract String getPublicId();

  public abstract String getSystemId();

  public abstract int getLineNumber();

  public abstract int getColumnNumber();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.Locator
 * JD-Core Version:    0.6.0
 */
package org.w3c.dom;

public abstract interface DOMError
{
  public static final short SEVERITY_WARNING = 1;
  public static final short SEVERITY_ERROR = 2;
  public static final short SEVERITY_FATAL_ERROR = 3;

  public abstract short getSeverity();

  public abstract String getMessage();

  public abstract String getType();

  public abstract Object getRelatedException();

  public abstract Object getRelatedData();

  public abstract DOMLocator getLocation();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.DOMError
 * JD-Core Version:    0.6.0
 */
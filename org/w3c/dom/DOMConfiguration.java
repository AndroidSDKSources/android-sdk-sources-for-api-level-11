package org.w3c.dom;

public abstract interface DOMConfiguration
{
  public abstract void setParameter(String paramString, Object paramObject)
    throws DOMException;

  public abstract Object getParameter(String paramString)
    throws DOMException;

  public abstract boolean canSetParameter(String paramString, Object paramObject);

  public abstract DOMStringList getParameterNames();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.DOMConfiguration
 * JD-Core Version:    0.6.0
 */
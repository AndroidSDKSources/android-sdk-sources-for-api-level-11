package org.w3c.dom;

public abstract interface DOMLocator
{
  public abstract int getLineNumber();

  public abstract int getColumnNumber();

  public abstract int getByteOffset();

  public abstract int getUtf16Offset();

  public abstract Node getRelatedNode();

  public abstract String getUri();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.DOMLocator
 * JD-Core Version:    0.6.0
 */
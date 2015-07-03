package org.w3c.dom;

public abstract interface Entity extends Node
{
  public abstract String getPublicId();

  public abstract String getSystemId();

  public abstract String getNotationName();

  public abstract String getInputEncoding();

  public abstract String getXmlEncoding();

  public abstract String getXmlVersion();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.Entity
 * JD-Core Version:    0.6.0
 */
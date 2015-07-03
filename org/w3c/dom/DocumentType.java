package org.w3c.dom;

public abstract interface DocumentType extends Node
{
  public abstract String getName();

  public abstract NamedNodeMap getEntities();

  public abstract NamedNodeMap getNotations();

  public abstract String getPublicId();

  public abstract String getSystemId();

  public abstract String getInternalSubset();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.DocumentType
 * JD-Core Version:    0.6.0
 */
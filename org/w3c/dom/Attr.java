package org.w3c.dom;

public abstract interface Attr extends Node
{
  public abstract String getName();

  public abstract boolean getSpecified();

  public abstract String getValue();

  public abstract void setValue(String paramString)
    throws DOMException;

  public abstract Element getOwnerElement();

  public abstract TypeInfo getSchemaTypeInfo();

  public abstract boolean isId();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.Attr
 * JD-Core Version:    0.6.0
 */
package org.w3c.dom;

public abstract interface CharacterData extends Node
{
  public abstract String getData()
    throws DOMException;

  public abstract void setData(String paramString)
    throws DOMException;

  public abstract int getLength();

  public abstract String substringData(int paramInt1, int paramInt2)
    throws DOMException;

  public abstract void appendData(String paramString)
    throws DOMException;

  public abstract void insertData(int paramInt, String paramString)
    throws DOMException;

  public abstract void deleteData(int paramInt1, int paramInt2)
    throws DOMException;

  public abstract void replaceData(int paramInt1, int paramInt2, String paramString)
    throws DOMException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.CharacterData
 * JD-Core Version:    0.6.0
 */
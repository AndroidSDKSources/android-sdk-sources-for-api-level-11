package org.w3c.dom;

public abstract interface Text extends CharacterData
{
  public abstract Text splitText(int paramInt)
    throws DOMException;

  public abstract boolean isElementContentWhitespace();

  public abstract String getWholeText();

  public abstract Text replaceWholeText(String paramString)
    throws DOMException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.w3c.dom.Text
 * JD-Core Version:    0.6.0
 */
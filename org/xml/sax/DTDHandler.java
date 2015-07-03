package org.xml.sax;

public abstract interface DTDHandler
{
  public abstract void notationDecl(String paramString1, String paramString2, String paramString3)
    throws SAXException;

  public abstract void unparsedEntityDecl(String paramString1, String paramString2, String paramString3, String paramString4)
    throws SAXException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.DTDHandler
 * JD-Core Version:    0.6.0
 */
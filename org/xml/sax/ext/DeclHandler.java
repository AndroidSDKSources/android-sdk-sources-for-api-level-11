package org.xml.sax.ext;

import org.xml.sax.SAXException;

public abstract interface DeclHandler
{
  public abstract void elementDecl(String paramString1, String paramString2)
    throws SAXException;

  public abstract void attributeDecl(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
    throws SAXException;

  public abstract void internalEntityDecl(String paramString1, String paramString2)
    throws SAXException;

  public abstract void externalEntityDecl(String paramString1, String paramString2, String paramString3)
    throws SAXException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.ext.DeclHandler
 * JD-Core Version:    0.6.0
 */
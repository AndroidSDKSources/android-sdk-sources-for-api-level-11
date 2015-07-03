package org.xml.sax;

public abstract interface XMLFilter extends XMLReader
{
  public abstract void setParent(XMLReader paramXMLReader);

  public abstract XMLReader getParent();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.XMLFilter
 * JD-Core Version:    0.6.0
 */
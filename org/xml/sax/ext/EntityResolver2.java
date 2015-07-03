package org.xml.sax.ext;

import java.io.IOException;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

public abstract interface EntityResolver2 extends EntityResolver
{
  public abstract InputSource getExternalSubset(String paramString1, String paramString2)
    throws SAXException, IOException;

  public abstract InputSource resolveEntity(String paramString1, String paramString2, String paramString3, String paramString4)
    throws SAXException, IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.xml.sax.ext.EntityResolver2
 * JD-Core Version:    0.6.0
 */
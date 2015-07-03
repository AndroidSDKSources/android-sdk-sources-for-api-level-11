package javax.xml.namespace;

import java.util.Iterator;

public abstract interface NamespaceContext
{
  public abstract String getNamespaceURI(String paramString);

  public abstract String getPrefix(String paramString);

  public abstract Iterator getPrefixes(String paramString);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.namespace.NamespaceContext
 * JD-Core Version:    0.6.0
 */
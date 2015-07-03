package javax.xml.xpath;

import javax.xml.namespace.QName;

public abstract interface XPathFunctionResolver
{
  public abstract XPathFunction resolveFunction(QName paramQName, int paramInt);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.xpath.XPathFunctionResolver
 * JD-Core Version:    0.6.0
 */
package javax.xml.xpath;

import java.util.List;

public abstract interface XPathFunction
{
  public abstract Object evaluate(List paramList)
    throws XPathFunctionException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.xpath.XPathFunction
 * JD-Core Version:    0.6.0
 */
package javax.xml.transform.dom;

import javax.xml.transform.SourceLocator;
import org.w3c.dom.Node;

public abstract interface DOMLocator extends SourceLocator
{
  public abstract Node getOriginatingNode();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.dom.DOMLocator
 * JD-Core Version:    0.6.0
 */
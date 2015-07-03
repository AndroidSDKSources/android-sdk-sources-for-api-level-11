package javax.xml.transform;

public abstract interface ErrorListener
{
  public abstract void warning(TransformerException paramTransformerException)
    throws TransformerException;

  public abstract void error(TransformerException paramTransformerException)
    throws TransformerException;

  public abstract void fatalError(TransformerException paramTransformerException)
    throws TransformerException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.ErrorListener
 * JD-Core Version:    0.6.0
 */
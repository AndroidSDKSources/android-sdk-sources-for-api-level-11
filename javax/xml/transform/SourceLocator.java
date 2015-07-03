package javax.xml.transform;

public abstract interface SourceLocator
{
  public abstract String getPublicId();

  public abstract String getSystemId();

  public abstract int getLineNumber();

  public abstract int getColumnNumber();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.xml.transform.SourceLocator
 * JD-Core Version:    0.6.0
 */
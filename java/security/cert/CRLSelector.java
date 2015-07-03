package java.security.cert;

public abstract interface CRLSelector extends Cloneable
{
  public abstract Object clone();

  public abstract boolean match(CRL paramCRL);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CRLSelector
 * JD-Core Version:    0.6.0
 */
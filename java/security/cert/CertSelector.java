package java.security.cert;

public abstract interface CertSelector extends Cloneable
{
  public abstract Object clone();

  public abstract boolean match(Certificate paramCertificate);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertSelector
 * JD-Core Version:    0.6.0
 */
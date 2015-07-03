package java.security.cert;

public abstract interface CertPathBuilderResult extends Cloneable
{
  public abstract Object clone();

  public abstract CertPath getCertPath();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.CertPathBuilderResult
 * JD-Core Version:    0.6.0
 */
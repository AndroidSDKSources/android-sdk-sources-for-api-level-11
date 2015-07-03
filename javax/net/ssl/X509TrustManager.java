package javax.net.ssl;

import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;

public abstract interface X509TrustManager extends TrustManager
{
  public abstract void checkClientTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    throws CertificateException;

  public abstract void checkServerTrusted(X509Certificate[] paramArrayOfX509Certificate, String paramString)
    throws CertificateException;

  public abstract X509Certificate[] getAcceptedIssuers();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.X509TrustManager
 * JD-Core Version:    0.6.0
 */
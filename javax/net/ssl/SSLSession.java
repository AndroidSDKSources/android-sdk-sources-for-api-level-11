package javax.net.ssl;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.security.cert.X509Certificate;

public abstract interface SSLSession
{
  public abstract int getApplicationBufferSize();

  public abstract String getCipherSuite();

  public abstract long getCreationTime();

  public abstract byte[] getId();

  public abstract long getLastAccessedTime();

  public abstract Certificate[] getLocalCertificates();

  public abstract Principal getLocalPrincipal();

  public abstract int getPacketBufferSize();

  public abstract X509Certificate[] getPeerCertificateChain()
    throws SSLPeerUnverifiedException;

  public abstract Certificate[] getPeerCertificates()
    throws SSLPeerUnverifiedException;

  public abstract String getPeerHost();

  public abstract int getPeerPort();

  public abstract Principal getPeerPrincipal()
    throws SSLPeerUnverifiedException;

  public abstract String getProtocol();

  public abstract SSLSessionContext getSessionContext();

  public abstract Object getValue(String paramString);

  public abstract String[] getValueNames();

  public abstract void invalidate();

  public abstract boolean isValid();

  public abstract void putValue(String paramString, Object paramObject);

  public abstract void removeValue(String paramString);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLSession
 * JD-Core Version:    0.6.0
 */
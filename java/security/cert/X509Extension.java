package java.security.cert;

import java.util.Set;

public abstract interface X509Extension
{
  public abstract Set<String> getCriticalExtensionOIDs();

  public abstract byte[] getExtensionValue(String paramString);

  public abstract Set<String> getNonCriticalExtensionOIDs();

  public abstract boolean hasUnsupportedCriticalExtension();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.cert.X509Extension
 * JD-Core Version:    0.6.0
 */
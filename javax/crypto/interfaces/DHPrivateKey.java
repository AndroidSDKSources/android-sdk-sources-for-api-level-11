package javax.crypto.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public abstract interface DHPrivateKey extends DHKey, PrivateKey
{
  public static final long serialVersionUID = 2211791113380396553L;

  public abstract BigInteger getX();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.interfaces.DHPrivateKey
 * JD-Core Version:    0.6.0
 */
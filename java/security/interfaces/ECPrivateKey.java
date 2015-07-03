package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public abstract interface ECPrivateKey extends PrivateKey, ECKey
{
  public static final long serialVersionUID = -7896394956925609184L;

  public abstract BigInteger getS();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.interfaces.ECPrivateKey
 * JD-Core Version:    0.6.0
 */
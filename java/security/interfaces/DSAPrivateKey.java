package java.security.interfaces;

import java.math.BigInteger;
import java.security.PrivateKey;

public abstract interface DSAPrivateKey extends DSAKey, PrivateKey
{
  public static final long serialVersionUID = 7776497482533790279L;

  public abstract BigInteger getX();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.interfaces.DSAPrivateKey
 * JD-Core Version:    0.6.0
 */
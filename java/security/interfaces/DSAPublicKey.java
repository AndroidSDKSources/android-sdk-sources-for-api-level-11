package java.security.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public abstract interface DSAPublicKey extends DSAKey, PublicKey
{
  public static final long serialVersionUID = 1234526332779022332L;

  public abstract BigInteger getY();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.interfaces.DSAPublicKey
 * JD-Core Version:    0.6.0
 */
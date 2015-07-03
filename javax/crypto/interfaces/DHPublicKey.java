package javax.crypto.interfaces;

import java.math.BigInteger;
import java.security.PublicKey;

public abstract interface DHPublicKey extends DHKey, PublicKey
{
  public static final long serialVersionUID = -6628103563352519193L;

  public abstract BigInteger getY();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.interfaces.DHPublicKey
 * JD-Core Version:    0.6.0
 */
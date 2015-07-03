package javax.crypto.interfaces;

import javax.crypto.SecretKey;

public abstract interface PBEKey extends SecretKey
{
  public static final long serialVersionUID = -1430015993304333921L;

  public abstract int getIterationCount();

  public abstract byte[] getSalt();

  public abstract char[] getPassword();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.crypto.interfaces.PBEKey
 * JD-Core Version:    0.6.0
 */
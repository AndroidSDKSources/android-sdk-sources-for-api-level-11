package java.security.interfaces;

import java.math.BigInteger;

public abstract interface DSAParams
{
  public abstract BigInteger getG();

  public abstract BigInteger getP();

  public abstract BigInteger getQ();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.interfaces.DSAParams
 * JD-Core Version:    0.6.0
 */
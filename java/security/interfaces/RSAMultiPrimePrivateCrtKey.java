package java.security.interfaces;

import java.math.BigInteger;
import java.security.spec.RSAOtherPrimeInfo;

public abstract interface RSAMultiPrimePrivateCrtKey extends RSAPrivateKey
{
  public static final long serialVersionUID = 618058533534628008L;

  public abstract BigInteger getCrtCoefficient();

  public abstract RSAOtherPrimeInfo[] getOtherPrimeInfo();

  public abstract BigInteger getPrimeP();

  public abstract BigInteger getPrimeQ();

  public abstract BigInteger getPrimeExponentP();

  public abstract BigInteger getPrimeExponentQ();

  public abstract BigInteger getPublicExponent();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.interfaces.RSAMultiPrimePrivateCrtKey
 * JD-Core Version:    0.6.0
 */
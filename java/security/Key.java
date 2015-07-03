package java.security;

import java.io.Serializable;

public abstract interface Key extends Serializable
{
  public static final long serialVersionUID = 6603384152749567654L;

  public abstract String getAlgorithm();

  public abstract String getFormat();

  public abstract byte[] getEncoded();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.Key
 * JD-Core Version:    0.6.0
 */
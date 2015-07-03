package java.util.zip;

public abstract interface Checksum
{
  public abstract long getValue();

  public abstract void reset();

  public abstract void update(byte[] paramArrayOfByte, int paramInt1, int paramInt2);

  public abstract void update(int paramInt);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.zip.Checksum
 * JD-Core Version:    0.6.0
 */
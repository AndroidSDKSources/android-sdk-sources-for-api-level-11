package java.io;

public abstract interface ObjectInput extends DataInput
{
  public abstract int available()
    throws IOException;

  public abstract void close()
    throws IOException;

  public abstract int read()
    throws IOException;

  public abstract int read(byte[] paramArrayOfByte)
    throws IOException;

  public abstract int read(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws IOException;

  public abstract Object readObject()
    throws ClassNotFoundException, IOException;

  public abstract long skip(long paramLong)
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.ObjectInput
 * JD-Core Version:    0.6.0
 */
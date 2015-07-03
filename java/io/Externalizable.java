package java.io;

public abstract interface Externalizable extends Serializable
{
  public abstract void readExternal(ObjectInput paramObjectInput)
    throws IOException, ClassNotFoundException;

  public abstract void writeExternal(ObjectOutput paramObjectOutput)
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.io.Externalizable
 * JD-Core Version:    0.6.0
 */
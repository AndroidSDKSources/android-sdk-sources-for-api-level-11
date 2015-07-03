package java.nio.channels;

import java.io.Closeable;
import java.io.IOException;

public abstract interface Channel extends Closeable
{
  public abstract boolean isOpen();

  public abstract void close()
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.Channel
 * JD-Core Version:    0.6.0
 */
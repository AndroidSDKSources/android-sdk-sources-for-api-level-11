package java.nio.channels;

import java.io.IOException;

public abstract interface InterruptibleChannel extends Channel
{
  public abstract void close()
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.InterruptibleChannel
 * JD-Core Version:    0.6.0
 */
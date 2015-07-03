package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract interface ReadableByteChannel extends Channel
{
  public abstract int read(ByteBuffer paramByteBuffer)
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.ReadableByteChannel
 * JD-Core Version:    0.6.0
 */
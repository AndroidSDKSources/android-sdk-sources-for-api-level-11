package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract interface ScatteringByteChannel extends ReadableByteChannel
{
  public abstract long read(ByteBuffer[] paramArrayOfByteBuffer)
    throws IOException;

  public abstract long read(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2)
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.ScatteringByteChannel
 * JD-Core Version:    0.6.0
 */
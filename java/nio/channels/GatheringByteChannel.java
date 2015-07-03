package java.nio.channels;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract interface GatheringByteChannel extends WritableByteChannel
{
  public abstract long write(ByteBuffer[] paramArrayOfByteBuffer)
    throws IOException;

  public abstract long write(ByteBuffer[] paramArrayOfByteBuffer, int paramInt1, int paramInt2)
    throws IOException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.nio.channels.GatheringByteChannel
 * JD-Core Version:    0.6.0
 */
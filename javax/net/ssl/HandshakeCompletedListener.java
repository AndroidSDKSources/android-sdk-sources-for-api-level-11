package javax.net.ssl;

import java.util.EventListener;

public abstract interface HandshakeCompletedListener extends EventListener
{
  public abstract void handshakeCompleted(HandshakeCompletedEvent paramHandshakeCompletedEvent);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.HandshakeCompletedListener
 * JD-Core Version:    0.6.0
 */
package javax.net.ssl;

import java.util.EventListener;

public abstract interface SSLSessionBindingListener extends EventListener
{
  public abstract void valueBound(SSLSessionBindingEvent paramSSLSessionBindingEvent);

  public abstract void valueUnbound(SSLSessionBindingEvent paramSSLSessionBindingEvent);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLSessionBindingListener
 * JD-Core Version:    0.6.0
 */
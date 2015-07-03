package java.net;

public abstract interface SocketOptions
{
  public static final int SO_LINGER = 128;
  public static final int SO_TIMEOUT = 4102;
  public static final int TCP_NODELAY = 1;
  public static final int IP_MULTICAST_IF = 16;
  public static final int SO_BINDADDR = 15;
  public static final int SO_REUSEADDR = 4;
  public static final int SO_SNDBUF = 4097;
  public static final int SO_RCVBUF = 4098;
  public static final int SO_KEEPALIVE = 8;
  public static final int IP_TOS = 3;
  public static final int IP_MULTICAST_LOOP = 18;
  public static final int SO_BROADCAST = 32;
  public static final int SO_OOBINLINE = 4099;
  public static final int IP_MULTICAST_IF2 = 31;

  public abstract Object getOption(int paramInt)
    throws SocketException;

  public abstract void setOption(int paramInt, Object paramObject)
    throws SocketException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.SocketOptions
 * JD-Core Version:    0.6.0
 */
/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.DatagramChannel;
/*    */ 
/*    */ public class DatagramSocket
/*    */ {
/*    */   public DatagramSocket()
/*    */     throws SocketException
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public DatagramSocket(int aPort) throws SocketException { throw new RuntimeException("Stub!"); } 
/*  6 */   public DatagramSocket(int aPort, InetAddress addr) throws SocketException { throw new RuntimeException("Stub!"); } 
/*  7 */   protected DatagramSocket(DatagramSocketImpl socketImpl) { throw new RuntimeException("Stub!"); } 
/*  8 */   public DatagramSocket(SocketAddress localAddr) throws SocketException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 10 */   public void connect(InetAddress anAddress, int aPort) { throw new RuntimeException("Stub!"); } 
/* 11 */   public void disconnect() { throw new RuntimeException("Stub!"); } 
/* 12 */   public InetAddress getInetAddress() { throw new RuntimeException("Stub!"); } 
/* 13 */   public InetAddress getLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getLocalPort() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int getPort() { throw new RuntimeException("Stub!"); } 
/* 16 */   public synchronized int getReceiveBufferSize() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 17 */   public synchronized int getSendBufferSize() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 18 */   public synchronized int getSoTimeout() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized void receive(DatagramPacket pack) throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void send(DatagramPacket pack) throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public synchronized void setSendBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 22 */   public synchronized void setReceiveBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 23 */   public synchronized void setSoTimeout(int timeout) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 24 */   public static synchronized void setDatagramSocketImplFactory(DatagramSocketImplFactory fac) throws IOException { throw new RuntimeException("Stub!"); } 
/* 25 */   public void bind(SocketAddress localAddr) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 26 */   public void connect(SocketAddress remoteAddr) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isBound() { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean isConnected() { throw new RuntimeException("Stub!"); } 
/* 29 */   public SocketAddress getRemoteSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 30 */   public SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setReuseAddress(boolean reuse) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean getReuseAddress() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 33 */   public void setBroadcast(boolean broadcast) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean getBroadcast() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 35 */   public void setTrafficClass(int value) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 36 */   public int getTrafficClass() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean isClosed() { throw new RuntimeException("Stub!"); } 
/* 38 */   public DatagramChannel getChannel() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.DatagramSocket
 * JD-Core Version:    0.6.0
 */
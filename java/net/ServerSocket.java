/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.nio.channels.ServerSocketChannel;
/*    */ 
/*    */ public class ServerSocket
/*    */ {
/*    */   public ServerSocket()
/*    */     throws IOException
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public ServerSocket(int aport) throws IOException { throw new RuntimeException("Stub!"); } 
/*  6 */   public ServerSocket(int aport, int backlog) throws IOException { throw new RuntimeException("Stub!"); } 
/*  7 */   public ServerSocket(int aport, int backlog, InetAddress localAddr) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   public Socket accept() throws IOException { throw new RuntimeException("Stub!"); } 
/*  9 */   public void close() throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public InetAddress getInetAddress() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int getLocalPort() { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized int getSoTimeout() throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   protected final void implAccept(Socket aSocket) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public static synchronized void setSocketFactory(SocketImplFactory aFactory) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized void setSoTimeout(int timeout) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 16 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void bind(SocketAddress localAddr) throws IOException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void bind(SocketAddress localAddr, int backlog) throws IOException { throw new RuntimeException("Stub!"); } 
/* 19 */   public SocketAddress getLocalSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isBound() { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isClosed() { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setReuseAddress(boolean reuse) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean getReuseAddress() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 24 */   public void setReceiveBufferSize(int size) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 25 */   public int getReceiveBufferSize() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 26 */   public ServerSocketChannel getChannel() { throw new RuntimeException("Stub!"); } 
/* 27 */   public void setPerformancePreferences(int connectionTime, int latency, int bandwidth) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.ServerSocket
 * JD-Core Version:    0.6.0
 */
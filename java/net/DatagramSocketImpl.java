/*    */ package java.net;
/*    */ 
/*    */ import java.io.FileDescriptor;
/*    */ import java.io.IOException;
/*    */ 
/*    */ public abstract class DatagramSocketImpl
/*    */   implements SocketOptions
/*    */ {
/*    */   protected FileDescriptor fd;
/*    */   protected int localPort;
/*    */ 
/*    */   public DatagramSocketImpl()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*    */   protected abstract void bind(int paramInt, InetAddress paramInetAddress) throws SocketException;
/*    */ 
/*    */   protected abstract void close();
/*    */ 
/*    */   protected abstract void create() throws SocketException;
/*    */ 
/*  9 */   protected FileDescriptor getFileDescriptor() { throw new RuntimeException("Stub!"); } 
/* 10 */   protected int getLocalPort() { throw new RuntimeException("Stub!"); } 
/*    */   protected abstract byte getTTL() throws IOException;
/*    */ 
/*    */   protected abstract int getTimeToLive() throws IOException;
/*    */ 
/*    */   protected abstract void join(InetAddress paramInetAddress) throws IOException;
/*    */ 
/*    */   protected abstract void joinGroup(SocketAddress paramSocketAddress, NetworkInterface paramNetworkInterface) throws IOException;
/*    */ 
/*    */   protected abstract void leave(InetAddress paramInetAddress) throws IOException;
/*    */ 
/*    */   protected abstract void leaveGroup(SocketAddress paramSocketAddress, NetworkInterface paramNetworkInterface) throws IOException;
/*    */ 
/*    */   protected abstract int peek(InetAddress paramInetAddress) throws IOException;
/*    */ 
/*    */   protected abstract void receive(DatagramPacket paramDatagramPacket) throws IOException;
/*    */ 
/*    */   protected abstract void send(DatagramPacket paramDatagramPacket) throws IOException;
/*    */ 
/*    */   protected abstract void setTimeToLive(int paramInt) throws IOException;
/*    */ 
/*    */   protected abstract void setTTL(byte paramByte) throws IOException;
/*    */ 
/* 22 */   protected void connect(InetAddress inetAddr, int port) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 23 */   protected void disconnect() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   protected abstract int peekData(DatagramPacket paramDatagramPacket)
/*    */     throws IOException;
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.DatagramSocketImpl
 * JD-Core Version:    0.6.0
 */
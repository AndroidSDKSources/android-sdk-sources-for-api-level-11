/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ 
/*    */ public class MulticastSocket extends DatagramSocket
/*    */ {
/*    */   public MulticastSocket()
/*    */     throws IOException
/*    */   {
/*  5 */     super((DatagramSocketImpl)null); throw new RuntimeException("Stub!"); } 
/*  6 */   public MulticastSocket(int aPort) throws IOException { super((DatagramSocketImpl)null); throw new RuntimeException("Stub!"); } 
/*  7 */   public MulticastSocket(SocketAddress localAddr) throws IOException { super((DatagramSocketImpl)null); throw new RuntimeException("Stub!"); } 
/*  8 */   public InetAddress getInterface() throws SocketException { throw new RuntimeException("Stub!"); } 
/*  9 */   public NetworkInterface getNetworkInterface() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 10 */   public int getTimeToLive() throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public byte getTTL() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public void joinGroup(InetAddress groupAddr) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public void joinGroup(SocketAddress groupAddress, NetworkInterface netInterface) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void leaveGroup(InetAddress groupAddr) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public void leaveGroup(SocketAddress groupAddress, NetworkInterface netInterface) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public void send(DatagramPacket pack, byte ttl) throws IOException { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setInterface(InetAddress addr) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setNetworkInterface(NetworkInterface netInterface) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setTimeToLive(int ttl) throws IOException { throw new RuntimeException("Stub!"); } 
/* 20 */   public void setTTL(byte ttl) throws IOException { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean getLoopbackMode() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 22 */   public void setLoopbackMode(boolean disable) throws SocketException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.MulticastSocket
 * JD-Core Version:    0.6.0
 */
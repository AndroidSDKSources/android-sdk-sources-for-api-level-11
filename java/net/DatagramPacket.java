/*    */ package java.net;
/*    */ 
/*    */ public final class DatagramPacket
/*    */ {
/*    */   public DatagramPacket(byte[] data, int length)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public DatagramPacket(byte[] data, int offset, int length) { throw new RuntimeException("Stub!"); } 
/*  6 */   public DatagramPacket(byte[] data, int offset, int length, InetAddress host, int aPort) { throw new RuntimeException("Stub!"); } 
/*  7 */   public DatagramPacket(byte[] data, int length, InetAddress host, int port) { throw new RuntimeException("Stub!"); } 
/*  8 */   public DatagramPacket(byte[] data, int length, SocketAddress sockAddr) throws SocketException { throw new RuntimeException("Stub!"); } 
/*  9 */   public DatagramPacket(byte[] data, int offset, int length, SocketAddress sockAddr) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 10 */   public synchronized InetAddress getAddress() { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized byte[] getData() { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized int getLength() { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized int getOffset() { throw new RuntimeException("Stub!"); } 
/* 14 */   public synchronized int getPort() { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized void setAddress(InetAddress addr) { throw new RuntimeException("Stub!"); } 
/* 16 */   public synchronized void setData(byte[] data, int offset, int byteCount) { throw new RuntimeException("Stub!"); } 
/* 17 */   public synchronized void setData(byte[] buf) { throw new RuntimeException("Stub!"); } 
/* 18 */   public synchronized void setLength(int length) { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized void setPort(int aPort) { throw new RuntimeException("Stub!"); } 
/* 20 */   public synchronized SocketAddress getSocketAddress() { throw new RuntimeException("Stub!"); } 
/* 21 */   public synchronized void setSocketAddress(SocketAddress sockAddr) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.DatagramPacket
 * JD-Core Version:    0.6.0
 */
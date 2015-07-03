/*    */ package java.net;
/*    */ 
/*    */ import java.util.Enumeration;
/*    */ import java.util.List;
/*    */ 
/*    */ public final class NetworkInterface
/*    */ {
/*    */   NetworkInterface()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public String getName() { throw new RuntimeException("Stub!"); } 
/*  6 */   public Enumeration<InetAddress> getInetAddresses() { throw new RuntimeException("Stub!"); } 
/*  7 */   public String getDisplayName() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static NetworkInterface getByName(String interfaceName) throws SocketException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static NetworkInterface getByInetAddress(InetAddress address) throws SocketException { throw new RuntimeException("Stub!"); } 
/* 10 */   public static Enumeration<NetworkInterface> getNetworkInterfaces() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 14 */   public List<InterfaceAddress> getInterfaceAddresses() { throw new RuntimeException("Stub!"); } 
/* 15 */   public Enumeration<NetworkInterface> getSubInterfaces() { throw new RuntimeException("Stub!"); } 
/* 16 */   public NetworkInterface getParent() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isUp() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isLoopback() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isPointToPoint() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean supportsMulticast() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 21 */   public byte[] getHardwareAddress() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 22 */   public int getMTU() throws SocketException { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isVirtual() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.NetworkInterface
 * JD-Core Version:    0.6.0
 */
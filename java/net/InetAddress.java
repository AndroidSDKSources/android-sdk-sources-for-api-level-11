/*    */ package java.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class InetAddress
/*    */   implements Serializable
/*    */ {
/*    */   InetAddress()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/*  7 */   public byte[] getAddress() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static InetAddress[] getAllByName(String host) throws UnknownHostException { throw new RuntimeException("Stub!"); } 
/*  9 */   public static InetAddress getByName(String host) throws UnknownHostException { throw new RuntimeException("Stub!"); } 
/* 10 */   public String getHostAddress() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getHostName() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getCanonicalHostName() { throw new RuntimeException("Stub!"); } 
/* 13 */   public static InetAddress getLocalHost() throws UnknownHostException { throw new RuntimeException("Stub!"); } 
/* 14 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean isMulticastAddress() { throw new RuntimeException("Stub!"); } 
/* 16 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isLoopbackAddress() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean isLinkLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean isSiteLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean isMCGlobal() { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean isMCNodeLocal() { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean isMCLinkLocal() { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean isMCSiteLocal() { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean isMCOrgLocal() { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean isAnyLocalAddress() { throw new RuntimeException("Stub!"); } 
/* 26 */   public boolean isReachable(int timeout) throws IOException { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean isReachable(NetworkInterface networkInterface, int ttl, int timeout) throws IOException { throw new RuntimeException("Stub!"); } 
/* 28 */   public static InetAddress getByAddress(byte[] ipAddress) throws UnknownHostException { throw new RuntimeException("Stub!"); } 
/* 29 */   public static InetAddress getByAddress(String hostName, byte[] ipAddress) throws UnknownHostException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.InetAddress
 * JD-Core Version:    0.6.0
 */
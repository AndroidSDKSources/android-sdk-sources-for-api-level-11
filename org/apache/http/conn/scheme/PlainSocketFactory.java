/*    */ package org.apache.http.conn.scheme;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import org.apache.http.params.HttpParams;
/*    */ 
/*    */ public final class PlainSocketFactory
/*    */   implements SocketFactory
/*    */ {
/*    */   public PlainSocketFactory(HostNameResolver nameResolver)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public PlainSocketFactory() { throw new RuntimeException("Stub!"); } 
/*  7 */   public static PlainSocketFactory getSocketFactory() { throw new RuntimeException("Stub!"); } 
/*  8 */   public Socket createSocket() { throw new RuntimeException("Stub!"); } 
/*  9 */   public Socket connectSocket(Socket sock, String host, int port, InetAddress localAddress, int localPort, HttpParams params) throws IOException { throw new RuntimeException("Stub!"); } 
/* 10 */   public final boolean isSecure(Socket sock) throws IllegalArgumentException { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean equals(Object obj) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int hashCode() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     org.apache.http.conn.scheme.PlainSocketFactory
 * JD-Core Version:    0.6.0
 */
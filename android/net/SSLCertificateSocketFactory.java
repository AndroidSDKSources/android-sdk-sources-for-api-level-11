/*    */ package android.net;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import javax.net.SocketFactory;
/*    */ 
/*    */ public class SSLCertificateSocketFactory extends javax.net.ssl.SSLSocketFactory
/*    */ {
/*    */   public SSLCertificateSocketFactory(int handshakeTimeoutMillis)
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static SocketFactory getDefault(int handshakeTimeoutMillis) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static javax.net.ssl.SSLSocketFactory getDefault(int handshakeTimeoutMillis, SSLSessionCache cache) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static javax.net.ssl.SSLSocketFactory getInsecure(int handshakeTimeoutMillis, SSLSessionCache cache) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static org.apache.http.conn.ssl.SSLSocketFactory getHttpSocketFactory(int handshakeTimeoutMillis, SSLSessionCache cache) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Socket createSocket(Socket k, String host, int port, boolean close) throws IOException { throw new RuntimeException("Stub!"); } 
/* 11 */   public Socket createSocket() throws IOException { throw new RuntimeException("Stub!"); } 
/* 12 */   public Socket createSocket(InetAddress addr, int port, InetAddress localAddr, int localPort) throws IOException { throw new RuntimeException("Stub!"); } 
/* 13 */   public Socket createSocket(InetAddress addr, int port) throws IOException { throw new RuntimeException("Stub!"); } 
/* 14 */   public Socket createSocket(String host, int port, InetAddress localAddr, int localPort) throws IOException { throw new RuntimeException("Stub!"); } 
/* 15 */   public Socket createSocket(String host, int port) throws IOException { throw new RuntimeException("Stub!"); } 
/* 16 */   public String[] getDefaultCipherSuites() { throw new RuntimeException("Stub!"); } 
/* 17 */   public String[] getSupportedCipherSuites() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.net.SSLCertificateSocketFactory
 * JD-Core Version:    0.6.0
 */
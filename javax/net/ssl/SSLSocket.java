/*    */ package javax.net.ssl;
/*    */ 
/*    */ import java.io.IOException;
/*    */ import java.net.InetAddress;
/*    */ import java.net.Socket;
/*    */ import java.net.UnknownHostException;
/*    */ 
/*    */ public abstract class SSLSocket extends Socket
/*    */ {
/*    */   protected SSLSocket()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   protected SSLSocket(String host, int port) throws IOException, UnknownHostException { throw new RuntimeException("Stub!"); } 
/*  7 */   protected SSLSocket(InetAddress address, int port) throws IOException { throw new RuntimeException("Stub!"); } 
/*  8 */   protected SSLSocket(String host, int port, InetAddress clientAddress, int clientPort) throws IOException, UnknownHostException { throw new RuntimeException("Stub!"); } 
/*  9 */   protected SSLSocket(InetAddress address, int port, InetAddress clientAddress, int clientPort) throws IOException { throw new RuntimeException("Stub!"); } 
/*    */   public abstract String[] getSupportedCipherSuites();
/*    */ 
/*    */   public abstract String[] getEnabledCipherSuites();
/*    */ 
/*    */   public abstract void setEnabledCipherSuites(String[] paramArrayOfString);
/*    */ 
/*    */   public abstract String[] getSupportedProtocols();
/*    */ 
/*    */   public abstract String[] getEnabledProtocols();
/*    */ 
/*    */   public abstract void setEnabledProtocols(String[] paramArrayOfString);
/*    */ 
/*    */   public abstract SSLSession getSession();
/*    */ 
/*    */   public abstract void addHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener);
/*    */ 
/*    */   public abstract void removeHandshakeCompletedListener(HandshakeCompletedListener paramHandshakeCompletedListener);
/*    */ 
/*    */   public abstract void startHandshake() throws IOException;
/*    */ 
/*    */   public abstract void setUseClientMode(boolean paramBoolean);
/*    */ 
/*    */   public abstract boolean getUseClientMode();
/*    */ 
/*    */   public abstract void setNeedClientAuth(boolean paramBoolean);
/*    */ 
/*    */   public abstract boolean getNeedClientAuth();
/*    */ 
/*    */   public abstract void setWantClientAuth(boolean paramBoolean);
/*    */ 
/*    */   public abstract boolean getWantClientAuth();
/*    */ 
/*    */   public abstract void setEnableSessionCreation(boolean paramBoolean);
/*    */ 
/*    */   public abstract boolean getEnableSessionCreation();
/*    */ 
/* 28 */   public SSLParameters getSSLParameters() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setSSLParameters(SSLParameters p) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLSocket
 * JD-Core Version:    0.6.0
 */
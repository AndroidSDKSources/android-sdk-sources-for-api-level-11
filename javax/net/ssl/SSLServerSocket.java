/*   */ package javax.net.ssl;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.InetAddress;
/*   */ import java.net.ServerSocket;
/*   */ 
/*   */ public abstract class SSLServerSocket extends ServerSocket
/*   */ {
/*   */   protected SSLServerSocket()
/*   */     throws IOException
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected SSLServerSocket(int port) throws IOException { throw new RuntimeException("Stub!"); } 
/* 7 */   protected SSLServerSocket(int port, int backlog) throws IOException { throw new RuntimeException("Stub!"); } 
/* 8 */   protected SSLServerSocket(int port, int backlog, InetAddress address) throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract String[] getEnabledCipherSuites();
/*   */ 
/*   */   public abstract void setEnabledCipherSuites(String[] paramArrayOfString);
/*   */ 
/*   */   public abstract String[] getSupportedCipherSuites();
/*   */ 
/*   */   public abstract String[] getSupportedProtocols();
/*   */ 
/*   */   public abstract String[] getEnabledProtocols();
/*   */ 
/*   */   public abstract void setEnabledProtocols(String[] paramArrayOfString);
/*   */ 
/*   */   public abstract void setNeedClientAuth(boolean paramBoolean);
/*   */ 
/*   */   public abstract boolean getNeedClientAuth();
/*   */ 
/*   */   public abstract void setWantClientAuth(boolean paramBoolean);
/*   */ 
/*   */   public abstract boolean getWantClientAuth();
/*   */ 
/*   */   public abstract void setUseClientMode(boolean paramBoolean);
/*   */ 
/*   */   public abstract boolean getUseClientMode();
/*   */ 
/*   */   public abstract void setEnableSessionCreation(boolean paramBoolean);
/*   */ 
/*   */   public abstract boolean getEnableSessionCreation();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLServerSocket
 * JD-Core Version:    0.6.0
 */
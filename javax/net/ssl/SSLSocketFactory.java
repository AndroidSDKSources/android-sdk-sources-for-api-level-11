/*   */ package javax.net.ssl;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.Socket;
/*   */ import javax.net.SocketFactory;
/*   */ 
/*   */ public abstract class SSLSocketFactory extends SocketFactory
/*   */ {
/*   */   public SSLSocketFactory()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public static synchronized SocketFactory getDefault() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract String[] getDefaultCipherSuites();
/*   */ 
/*   */   public abstract String[] getSupportedCipherSuites();
/*   */ 
/*   */   public abstract Socket createSocket(Socket paramSocket, String paramString, int paramInt, boolean paramBoolean)
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ssl.SSLSocketFactory
 * JD-Core Version:    0.6.0
 */
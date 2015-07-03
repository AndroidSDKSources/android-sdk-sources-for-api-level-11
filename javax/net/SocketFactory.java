/*   */ package javax.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.InetAddress;
/*   */ import java.net.Socket;
/*   */ import java.net.UnknownHostException;
/*   */ 
/*   */ public abstract class SocketFactory
/*   */ {
/*   */   protected SocketFactory()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static synchronized SocketFactory getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public Socket createSocket() throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Socket createSocket(String paramString, int paramInt)
/*   */     throws IOException, UnknownHostException;
/*   */ 
/*   */   public abstract Socket createSocket(String paramString, int paramInt1, InetAddress paramInetAddress, int paramInt2)
/*   */     throws IOException, UnknownHostException;
/*   */ 
/*   */   public abstract Socket createSocket(InetAddress paramInetAddress, int paramInt)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract Socket createSocket(InetAddress paramInetAddress1, int paramInt1, InetAddress paramInetAddress2, int paramInt2)
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.SocketFactory
 * JD-Core Version:    0.6.0
 */
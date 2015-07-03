/*   */ package javax.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.net.InetAddress;
/*   */ import java.net.ServerSocket;
/*   */ 
/*   */ public abstract class ServerSocketFactory
/*   */ {
/*   */   protected ServerSocketFactory()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static synchronized ServerSocketFactory getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public ServerSocket createServerSocket() throws IOException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract ServerSocket createServerSocket(int paramInt)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract ServerSocket createServerSocket(int paramInt1, int paramInt2)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract ServerSocket createServerSocket(int paramInt1, int paramInt2, InetAddress paramInetAddress)
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.net.ServerSocketFactory
 * JD-Core Version:    0.6.0
 */
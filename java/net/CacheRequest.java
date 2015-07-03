/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.OutputStream;
/*   */ 
/*   */ public abstract class CacheRequest
/*   */ {
/*   */   public CacheRequest()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract void abort();
/*   */ 
/*   */   public abstract OutputStream getBody()
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.CacheRequest
 * JD-Core Version:    0.6.0
 */
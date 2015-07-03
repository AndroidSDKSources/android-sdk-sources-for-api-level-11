/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.io.InputStream;
/*   */ import java.util.List;
/*   */ import java.util.Map;
/*   */ 
/*   */ public abstract class CacheResponse
/*   */ {
/*   */   public CacheResponse()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract InputStream getBody()
/*   */     throws IOException;
/*   */ 
/*   */   public abstract Map<String, List<String>> getHeaders()
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.CacheResponse
 * JD-Core Version:    0.6.0
 */
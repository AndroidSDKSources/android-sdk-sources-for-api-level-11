/*   */ package java.net;
/*   */ 
/*   */ import java.io.IOException;
/*   */ import java.util.List;
/*   */ import java.util.Map;
/*   */ 
/*   */ public abstract class ResponseCache
/*   */ {
/*   */   public ResponseCache()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public static ResponseCache getDefault() { throw new RuntimeException("Stub!"); } 
/* 6 */   public static void setDefault(ResponseCache responseCache) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract CacheResponse get(URI paramURI, String paramString, Map<String, List<String>> paramMap)
/*   */     throws IOException;
/*   */ 
/*   */   public abstract CacheRequest put(URI paramURI, URLConnection paramURLConnection)
/*   */     throws IOException;
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.net.ResponseCache
 * JD-Core Version:    0.6.0
 */
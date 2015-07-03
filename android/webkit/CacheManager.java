/*    */ package android.webkit;
/*    */ 
/*    */ import java.io.File;
/*    */ import java.io.InputStream;
/*    */ import java.io.OutputStream;
/*    */ import java.util.Map;
/*    */ 
/*    */ @Deprecated
/*    */ public final class CacheManager
/*    */ {
/*    */   public CacheManager()
/*    */   {
/* 25 */     throw new RuntimeException("Stub!"); } 
/* 26 */   public static File getCacheFileBaseDir() { throw new RuntimeException("Stub!"); } 
/* 27 */   public static boolean cacheDisabled() { throw new RuntimeException("Stub!"); } 
/* 28 */   public static boolean startCacheTransaction() { throw new RuntimeException("Stub!"); } 
/* 29 */   public static boolean endCacheTransaction() { throw new RuntimeException("Stub!"); } 
/* 30 */   public static CacheResult getCacheFile(String url, Map<String, String> headers) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static void saveCacheFile(String url, CacheResult cacheRet) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   @Deprecated
/*    */   public static class CacheResult
/*    */   {
/*    */     public CacheResult()
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public int getHttpStatusCode() { throw new RuntimeException("Stub!"); } 
/* 10 */     public long getContentLength() { throw new RuntimeException("Stub!"); } 
/* 11 */     public String getLocalPath() { throw new RuntimeException("Stub!"); } 
/* 12 */     public long getExpires() { throw new RuntimeException("Stub!"); } 
/* 13 */     public String getExpiresString() { throw new RuntimeException("Stub!"); } 
/* 14 */     public String getLastModified() { throw new RuntimeException("Stub!"); } 
/* 15 */     public String getETag() { throw new RuntimeException("Stub!"); } 
/* 16 */     public String getMimeType() { throw new RuntimeException("Stub!"); } 
/* 17 */     public String getLocation() { throw new RuntimeException("Stub!"); } 
/* 18 */     public String getEncoding() { throw new RuntimeException("Stub!"); } 
/* 19 */     public String getContentDisposition() { throw new RuntimeException("Stub!"); } 
/* 20 */     public InputStream getInputStream() { throw new RuntimeException("Stub!"); } 
/* 21 */     public OutputStream getOutputStream() { throw new RuntimeException("Stub!"); } 
/* 22 */     public void setInputStream(InputStream stream) { throw new RuntimeException("Stub!"); } 
/* 23 */     public void setEncoding(String encoding) { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.CacheManager
 * JD-Core Version:    0.6.0
 */
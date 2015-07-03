/*    */ package android.webkit;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ @Deprecated
/*    */ public final class UrlInterceptRegistry
/*    */ {
/*    */   public UrlInterceptRegistry()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public static synchronized void setUrlInterceptDisabled(boolean disabled) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static synchronized boolean urlInterceptDisabled() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static synchronized boolean registerHandler(UrlInterceptHandler handler) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static synchronized boolean unregisterHandler(UrlInterceptHandler handler) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static synchronized CacheManager.CacheResult getSurrogate(String url, Map<String, String> headers) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static synchronized PluginData getPluginData(String url, Map<String, String> headers) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.UrlInterceptRegistry
 * JD-Core Version:    0.6.0
 */
/*    */ package android.webkit;
/*    */ 
/*    */ import java.util.Map;
/*    */ 
/*    */ public final class WebStorage
/*    */ {
/*    */   public WebStorage()
/*    */   {
/* 15 */     throw new RuntimeException("Stub!"); } 
/* 16 */   public void getOrigins(ValueCallback<Map> callback) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void getUsageForOrigin(String origin, ValueCallback<Long> callback) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void getQuotaForOrigin(String origin, ValueCallback<Long> callback) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setQuotaForOrigin(String origin, long quota) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void deleteOrigin(String origin) { throw new RuntimeException("Stub!"); } 
/* 21 */   public void deleteAllData() { throw new RuntimeException("Stub!"); } 
/* 22 */   public static WebStorage getInstance() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class Origin
/*    */   {
/*    */     Origin()
/*    */     {
/* 10 */       throw new RuntimeException("Stub!"); } 
/* 11 */     public String getOrigin() { throw new RuntimeException("Stub!"); } 
/* 12 */     public long getQuota() { throw new RuntimeException("Stub!"); } 
/* 13 */     public long getUsage() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static abstract interface QuotaUpdater
/*    */   {
/*    */     public abstract void updateQuota(long paramLong);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.WebStorage
 * JD-Core Version:    0.6.0
 */
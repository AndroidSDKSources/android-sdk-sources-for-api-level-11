/*    */ package android.webkit;
/*    */ 
/*    */ import android.graphics.Bitmap;
/*    */ 
/*    */ public final class WebIconDatabase
/*    */ {
/*    */   WebIconDatabase()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public void open(String path) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void close() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void removeAllIcons() { throw new RuntimeException("Stub!"); } 
/* 12 */   public void requestIconForPageUrl(String url, IconListener listener) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void retainIconForPageUrl(String url) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void releaseIconForPageUrl(String url) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static WebIconDatabase getInstance() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface IconListener
/*    */   {
/*    */     public abstract void onReceivedIcon(String paramString, Bitmap paramBitmap);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.WebIconDatabase
 * JD-Core Version:    0.6.0
 */
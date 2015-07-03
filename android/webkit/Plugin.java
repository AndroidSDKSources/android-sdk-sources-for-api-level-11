/*    */ package android.webkit;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ @Deprecated
/*    */ public class Plugin
/*    */ {
/*    */   public Plugin(String name, String path, String fileName, String description)
/*    */   {
/*  9 */     throw new RuntimeException("Stub!"); } 
/* 10 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 11 */   public String getName() { throw new RuntimeException("Stub!"); } 
/* 12 */   public String getPath() { throw new RuntimeException("Stub!"); } 
/* 13 */   public String getFileName() { throw new RuntimeException("Stub!"); } 
/* 14 */   public String getDescription() { throw new RuntimeException("Stub!"); } 
/* 15 */   public void setName(String name) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void setPath(String path) { throw new RuntimeException("Stub!"); } 
/* 17 */   public void setFileName(String fileName) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void setDescription(String description) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void setClickHandler(PreferencesClickHandler handler) { throw new RuntimeException("Stub!"); } 
/* 20 */   public void dispatchClickEvent(Context context) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface PreferencesClickHandler
/*    */   {
/*    */     public abstract void handleClickEvent(Context paramContext);
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.webkit.Plugin
 * JD-Core Version:    0.6.0
 */
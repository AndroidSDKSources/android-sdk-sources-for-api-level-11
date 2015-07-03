/*    */ package android.renderscript;
/*    */ 
/*    */ import android.content.Context;
/*    */ 
/*    */ public class RenderScript
/*    */ {
/*    */   RenderScript()
/*    */   {
/* 26 */     throw new RuntimeException("Stub!"); } 
/* 27 */   public void setMessageHandler(RSMessageHandler msg) { throw new RuntimeException("Stub!"); } 
/* 28 */   public RSMessageHandler getMessageHandler() { throw new RuntimeException("Stub!"); } 
/* 29 */   public void setErrorHandler(RSErrorHandler msg) { throw new RuntimeException("Stub!"); } 
/* 30 */   public RSErrorHandler getErrorHandler() { throw new RuntimeException("Stub!"); } 
/* 31 */   public void setPriority(Priority p) { throw new RuntimeException("Stub!"); } 
/* 32 */   public final Context getApplicationContext() { throw new RuntimeException("Stub!"); } 
/* 33 */   public static RenderScript create(Context ctx) { throw new RuntimeException("Stub!"); } 
/* 34 */   public void contextDump() { throw new RuntimeException("Stub!"); } 
/* 35 */   public void finish() { throw new RuntimeException("Stub!"); } 
/* 36 */   public void destroy() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static enum Priority
/*    */   {
/* 23 */     LOW, 
/* 24 */     NORMAL;
/*    */   }
/*    */ 
/*    */   public static class RSErrorHandler
/*    */     implements Runnable
/*    */   {
/*    */     protected String mErrorMessage;
/*    */     protected int mErrorNum;
/*    */ 
/*    */     public RSErrorHandler()
/*    */     {
/* 16 */       throw new RuntimeException("Stub!"); } 
/* 17 */     public void run() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class RSMessageHandler
/*    */     implements Runnable
/*    */   {
/*  9 */     protected int[] mData = null;
/*    */     protected int mID;
/*    */     protected int mLength;
/*    */ 
/*    */     public RSMessageHandler()
/*    */     {
/*  7 */       throw new RuntimeException("Stub!"); } 
/*  8 */     public void run() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.renderscript.RenderScript
 * JD-Core Version:    0.6.0
 */
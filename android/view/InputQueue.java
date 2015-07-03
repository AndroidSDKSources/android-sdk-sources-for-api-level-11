/*   */ package android.view;
/*   */ 
/*   */ public final class InputQueue
/*   */ {
/*   */   InputQueue()
/*   */   {
/* 9 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public static abstract interface Callback
/*   */   {
/*   */     public abstract void onInputQueueCreated(InputQueue paramInputQueue);
/*   */ 
/*   */     public abstract void onInputQueueDestroyed(InputQueue paramInputQueue);
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.view.InputQueue
 * JD-Core Version:    0.6.0
 */
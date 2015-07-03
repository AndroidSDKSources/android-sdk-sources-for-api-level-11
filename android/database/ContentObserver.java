/*   */ package android.database;
/*   */ 
/*   */ import android.os.Handler;
/*   */ 
/*   */ public abstract class ContentObserver
/*   */ {
/*   */   public ContentObserver(Handler handler)
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public boolean deliverSelfNotifications() { throw new RuntimeException("Stub!"); } 
/* 6 */   public void onChange(boolean selfChange) { throw new RuntimeException("Stub!"); } 
/* 7 */   public final void dispatchChange(boolean selfChange) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.database.ContentObserver
 * JD-Core Version:    0.6.0
 */
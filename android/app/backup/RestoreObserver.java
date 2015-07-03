/*   */ package android.app.backup;
/*   */ 
/*   */ public abstract class RestoreObserver
/*   */ {
/*   */   public RestoreObserver()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void restoreStarting(int numPackages) { throw new RuntimeException("Stub!"); } 
/* 6 */   public void onUpdate(int nowBeingRestored, String currentPackage) { throw new RuntimeException("Stub!"); } 
/* 7 */   public void restoreFinished(int error) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.app.backup.RestoreObserver
 * JD-Core Version:    0.6.0
 */
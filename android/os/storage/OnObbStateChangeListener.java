/*   */ package android.os.storage;
/*   */ 
/*   */ public abstract class OnObbStateChangeListener
/*   */ {
/*   */   public static final int MOUNTED = 1;
/*   */   public static final int UNMOUNTED = 2;
/*   */   public static final int ERROR_INTERNAL = 20;
/*   */   public static final int ERROR_COULD_NOT_MOUNT = 21;
/*   */   public static final int ERROR_COULD_NOT_UNMOUNT = 22;
/*   */   public static final int ERROR_NOT_MOUNTED = 23;
/*   */   public static final int ERROR_ALREADY_MOUNTED = 24;
/*   */   public static final int ERROR_PERMISSION_DENIED = 25;
/*   */ 
/*   */   public OnObbStateChangeListener()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public void onObbStateChange(String path, int state) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.storage.OnObbStateChangeListener
 * JD-Core Version:    0.6.0
 */
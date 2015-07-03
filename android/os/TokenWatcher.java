/*    */ package android.os;
/*    */ 
/*    */ public abstract class TokenWatcher
/*    */ {
/*    */   public TokenWatcher(Handler h, String tag)
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*    */   public abstract void acquired();
/*    */ 
/*    */   public abstract void released();
/*    */ 
/*  7 */   public void acquire(IBinder token, String tag) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void cleanup(IBinder token, boolean unlink) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void release(IBinder token) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean isAcquired() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void dump() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.TokenWatcher
 * JD-Core Version:    0.6.0
 */
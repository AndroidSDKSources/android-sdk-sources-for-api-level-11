/*    */ package android.os;
/*    */ 
/*    */ public class RemoteCallbackList<E extends IInterface>
/*    */ {
/*    */   public RemoteCallbackList()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public boolean register(E callback) { throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean register(E callback, Object cookie) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean unregister(E callback) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void kill() { throw new RuntimeException("Stub!"); } 
/*  9 */   public void onCallbackDied(E callback) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void onCallbackDied(E callback, Object cookie) { throw new RuntimeException("Stub!"); } 
/* 11 */   public int beginBroadcast() { throw new RuntimeException("Stub!"); } 
/* 12 */   public E getBroadcastItem(int index) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Object getBroadcastCookie(int index) { throw new RuntimeException("Stub!"); } 
/* 14 */   public void finishBroadcast() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.RemoteCallbackList
 * JD-Core Version:    0.6.0
 */
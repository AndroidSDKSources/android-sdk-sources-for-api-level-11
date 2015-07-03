/*    */ package android.os;
/*    */ 
/*    */ public class MessageQueue
/*    */ {
/*    */   MessageQueue()
/*    */   {
/*  8 */     throw new RuntimeException("Stub!"); } 
/*  9 */   public final void addIdleHandler(IdleHandler handler) { throw new RuntimeException("Stub!"); } 
/* 10 */   public final void removeIdleHandler(IdleHandler handler) { throw new RuntimeException("Stub!"); } 
/* 11 */   protected void finalize() throws Throwable { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static abstract interface IdleHandler
/*    */   {
/*    */     public abstract boolean queueIdle();
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.os.MessageQueue
 * JD-Core Version:    0.6.0
 */
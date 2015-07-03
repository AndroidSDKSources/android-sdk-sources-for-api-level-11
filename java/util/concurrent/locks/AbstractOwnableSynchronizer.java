/*   */ package java.util.concurrent.locks;
/*   */ 
/*   */ import java.io.Serializable;
/*   */ 
/*   */ public abstract class AbstractOwnableSynchronizer
/*   */   implements Serializable
/*   */ {
/*   */   protected AbstractOwnableSynchronizer()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected final void setExclusiveOwnerThread(Thread t) { throw new RuntimeException("Stub!"); } 
/* 7 */   protected final Thread getExclusiveOwnerThread() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.locks.AbstractOwnableSynchronizer
 * JD-Core Version:    0.6.0
 */
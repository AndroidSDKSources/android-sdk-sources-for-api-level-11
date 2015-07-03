/*   */ package java.lang.ref;
/*   */ 
/*   */ public class ReferenceQueue<T>
/*   */ {
/*   */   public ReferenceQueue()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!"); } 
/* 5 */   public synchronized Reference<? extends T> poll() { throw new RuntimeException("Stub!"); } 
/* 6 */   public Reference<? extends T> remove() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 7 */   public synchronized Reference<? extends T> remove(long timeout) throws IllegalArgumentException, InterruptedException { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.ref.ReferenceQueue
 * JD-Core Version:    0.6.0
 */
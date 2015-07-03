/*   */ package java.lang.ref;
/*   */ 
/*   */ public class PhantomReference<T> extends Reference<T>
/*   */ {
/*   */   public PhantomReference(T r, ReferenceQueue<? super T> q)
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   public T get() { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.ref.PhantomReference
 * JD-Core Version:    0.6.0
 */
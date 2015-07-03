/*   */ package java.lang;
/*   */ 
/*   */ public class InheritableThreadLocal<T> extends ThreadLocal<T>
/*   */ {
/*   */   public InheritableThreadLocal()
/*   */   {
/* 5 */     throw new RuntimeException("Stub!"); } 
/* 6 */   protected T childValue(T parentValue) { throw new RuntimeException("Stub!");
/*   */   }
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.lang.InheritableThreadLocal
 * JD-Core Version:    0.6.0
 */
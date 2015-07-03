/*    */ package java.util;
/*    */ 
/*    */ public final class ServiceLoader<S>
/*    */   implements Iterable<S>
/*    */ {
/*    */   ServiceLoader()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public void reload() { throw new RuntimeException("Stub!"); } 
/*  7 */   public Iterator<S> iterator() { throw new RuntimeException("Stub!"); } 
/*  8 */   public static <S> ServiceLoader<S> load(Class<S> service, ClassLoader classLoader) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static <S> ServiceLoader<S> load(Class<S> service) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static <S> ServiceLoader<S> loadInstalled(Class<S> service) { throw new RuntimeException("Stub!"); } 
/* 11 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.ServiceLoader
 * JD-Core Version:    0.6.0
 */
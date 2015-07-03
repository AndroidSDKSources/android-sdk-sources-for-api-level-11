/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ public abstract class AtomicReferenceFieldUpdater<T, V>
/*    */ {
/*    */   protected AtomicReferenceFieldUpdater()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static <U, W> AtomicReferenceFieldUpdater<U, W> newUpdater(Class<U> tclass, Class<W> vclass, String fieldName) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean compareAndSet(T paramT, V paramV1, V paramV2);
/*    */ 
/*    */   public abstract boolean weakCompareAndSet(T paramT, V paramV1, V paramV2);
/*    */ 
/*    */   public abstract void set(T paramT, V paramV);
/*    */ 
/*    */   public abstract void lazySet(T paramT, V paramV);
/*    */ 
/*    */   public abstract V get(T paramT);
/*    */ 
/* 11 */   public V getAndSet(T obj, V newValue) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.atomic.AtomicReferenceFieldUpdater
 * JD-Core Version:    0.6.0
 */
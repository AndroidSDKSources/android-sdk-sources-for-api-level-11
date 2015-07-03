/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ public abstract class AtomicLongFieldUpdater<T>
/*    */ {
/*    */   protected AtomicLongFieldUpdater()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static <U> AtomicLongFieldUpdater<U> newUpdater(Class<U> tclass, String fieldName) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean compareAndSet(T paramT, long paramLong1, long paramLong2);
/*    */ 
/*    */   public abstract boolean weakCompareAndSet(T paramT, long paramLong1, long paramLong2);
/*    */ 
/*    */   public abstract void set(T paramT, long paramLong);
/*    */ 
/*    */   public abstract void lazySet(T paramT, long paramLong);
/*    */ 
/*    */   public abstract long get(T paramT);
/*    */ 
/* 11 */   public long getAndSet(T obj, long newValue) { throw new RuntimeException("Stub!"); } 
/* 12 */   public long getAndIncrement(T obj) { throw new RuntimeException("Stub!"); } 
/* 13 */   public long getAndDecrement(T obj) { throw new RuntimeException("Stub!"); } 
/* 14 */   public long getAndAdd(T obj, long delta) { throw new RuntimeException("Stub!"); } 
/* 15 */   public long incrementAndGet(T obj) { throw new RuntimeException("Stub!"); } 
/* 16 */   public long decrementAndGet(T obj) { throw new RuntimeException("Stub!"); } 
/* 17 */   public long addAndGet(T obj, long delta) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.atomic.AtomicLongFieldUpdater
 * JD-Core Version:    0.6.0
 */
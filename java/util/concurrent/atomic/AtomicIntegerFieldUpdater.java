/*    */ package java.util.concurrent.atomic;
/*    */ 
/*    */ public abstract class AtomicIntegerFieldUpdater<T>
/*    */ {
/*    */   protected AtomicIntegerFieldUpdater()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static <U> AtomicIntegerFieldUpdater<U> newUpdater(Class<U> tclass, String fieldName) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract boolean compareAndSet(T paramT, int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract boolean weakCompareAndSet(T paramT, int paramInt1, int paramInt2);
/*    */ 
/*    */   public abstract void set(T paramT, int paramInt);
/*    */ 
/*    */   public abstract void lazySet(T paramT, int paramInt);
/*    */ 
/*    */   public abstract int get(T paramT);
/*    */ 
/* 11 */   public int getAndSet(T obj, int newValue) { throw new RuntimeException("Stub!"); } 
/* 12 */   public int getAndIncrement(T obj) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int getAndDecrement(T obj) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int getAndAdd(T obj, int delta) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int incrementAndGet(T obj) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int decrementAndGet(T obj) { throw new RuntimeException("Stub!"); } 
/* 17 */   public int addAndGet(T obj, int delta) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.atomic.AtomicIntegerFieldUpdater
 * JD-Core Version:    0.6.0
 */
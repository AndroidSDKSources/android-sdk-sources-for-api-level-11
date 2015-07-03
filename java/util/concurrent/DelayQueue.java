/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.util.AbstractQueue;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public class DelayQueue<E extends Delayed> extends AbstractQueue<E>
/*    */   implements BlockingQueue<E>
/*    */ {
/*    */   public DelayQueue()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public DelayQueue(Collection<? extends E> c) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean add(E e) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void put(E e) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean offer(E e, long timeout, TimeUnit unit) { throw new RuntimeException("Stub!"); } 
/* 12 */   public E poll() { throw new RuntimeException("Stub!"); } 
/* 13 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 14 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 15 */   public E peek() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 17 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); } 
/* 18 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 20 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); } 
/* 21 */   public Object[] toArray() { throw new RuntimeException("Stub!"); } 
/* 22 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); } 
/* 23 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); } 
/* 24 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.DelayQueue
 * JD-Core Version:    0.6.0
 */
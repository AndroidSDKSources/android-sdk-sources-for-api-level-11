/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractQueue;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public class SynchronousQueue<E> extends AbstractQueue<E>
/*    */   implements BlockingQueue<E>, Serializable
/*    */ {
/*    */   public SynchronousQueue()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public SynchronousQueue(boolean fair) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void put(E o) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean offer(E o, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); } 
/* 11 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 12 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 13 */   public E poll() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 15 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); } 
/* 17 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean containsAll(Collection<?> c) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean removeAll(Collection<?> c) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean retainAll(Collection<?> c) { throw new RuntimeException("Stub!"); } 
/* 23 */   public E peek() { throw new RuntimeException("Stub!"); } 
/* 24 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); } 
/* 25 */   public Object[] toArray() { throw new RuntimeException("Stub!"); } 
/* 26 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); } 
/* 27 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); } 
/* 28 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.SynchronousQueue
 * JD-Core Version:    0.6.0
 */
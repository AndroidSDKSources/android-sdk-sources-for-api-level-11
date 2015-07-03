/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractQueue;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public class LinkedBlockingQueue<E> extends AbstractQueue<E>
/*    */   implements BlockingQueue<E>, Serializable
/*    */ {
/*    */   public LinkedBlockingQueue()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public LinkedBlockingQueue(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public LinkedBlockingQueue(Collection<? extends E> c) { throw new RuntimeException("Stub!"); } 
/*  9 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 10 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); } 
/* 11 */   public void put(E e) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); } 
/* 14 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 15 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 16 */   public E poll() { throw new RuntimeException("Stub!"); } 
/* 17 */   public E peek() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); } 
/* 20 */   public Object[] toArray() { throw new RuntimeException("Stub!"); } 
/* 21 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); } 
/* 22 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 23 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 24 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); } 
/* 25 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); } 
/* 26 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.LinkedBlockingQueue
 * JD-Core Version:    0.6.0
 */
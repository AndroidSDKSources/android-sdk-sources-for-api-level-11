/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractQueue;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ 
/*    */ public class LinkedBlockingDeque<E> extends AbstractQueue<E>
/*    */   implements BlockingDeque<E>, Serializable
/*    */ {
/*    */   public LinkedBlockingDeque()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public LinkedBlockingDeque(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public LinkedBlockingDeque(Collection<? extends E> c) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void addFirst(E e) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void addLast(E e) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean offerFirst(E e) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean offerLast(E e) { throw new RuntimeException("Stub!"); } 
/* 13 */   public void putFirst(E e) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 14 */   public void putLast(E e) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean offerFirst(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean offerLast(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 17 */   public E removeFirst() { throw new RuntimeException("Stub!"); } 
/* 18 */   public E removeLast() { throw new RuntimeException("Stub!"); } 
/* 19 */   public E pollFirst() { throw new RuntimeException("Stub!"); } 
/* 20 */   public E pollLast() { throw new RuntimeException("Stub!"); } 
/* 21 */   public E takeFirst() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 22 */   public E takeLast() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 23 */   public E pollFirst(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 24 */   public E pollLast(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 25 */   public E getFirst() { throw new RuntimeException("Stub!"); } 
/* 26 */   public E getLast() { throw new RuntimeException("Stub!"); } 
/* 27 */   public E peekFirst() { throw new RuntimeException("Stub!"); } 
/* 28 */   public E peekLast() { throw new RuntimeException("Stub!"); } 
/* 29 */   public boolean removeFirstOccurrence(Object o) { throw new RuntimeException("Stub!"); } 
/* 30 */   public boolean removeLastOccurrence(Object o) { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean add(E e) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean offer(E e) { throw new RuntimeException("Stub!"); } 
/* 33 */   public void put(E e) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 34 */   public boolean offer(E e, long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 35 */   public E remove() { throw new RuntimeException("Stub!"); } 
/* 36 */   public E poll() { throw new RuntimeException("Stub!"); } 
/* 37 */   public E take() throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 38 */   public E poll(long timeout, TimeUnit unit) throws InterruptedException { throw new RuntimeException("Stub!"); } 
/* 39 */   public E element() { throw new RuntimeException("Stub!"); } 
/* 40 */   public E peek() { throw new RuntimeException("Stub!"); } 
/* 41 */   public int remainingCapacity() { throw new RuntimeException("Stub!"); } 
/* 42 */   public int drainTo(Collection<? super E> c) { throw new RuntimeException("Stub!"); } 
/* 43 */   public int drainTo(Collection<? super E> c, int maxElements) { throw new RuntimeException("Stub!"); } 
/* 44 */   public void push(E e) { throw new RuntimeException("Stub!"); } 
/* 45 */   public E pop() { throw new RuntimeException("Stub!"); } 
/* 46 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); } 
/* 47 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 48 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); } 
/* 49 */   public Object[] toArray() { throw new RuntimeException("Stub!"); } 
/* 50 */   public <T> T[] toArray(T[] a) { throw new RuntimeException("Stub!"); } 
/* 51 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 52 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 53 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); } 
/* 54 */   public Iterator<E> descendingIterator() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.LinkedBlockingDeque
 * JD-Core Version:    0.6.0
 */
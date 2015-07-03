/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class Vector<E> extends AbstractList<E>
/*    */   implements List<E>, RandomAccess, Cloneable, Serializable
/*    */ {
/*    */   protected int elementCount;
/* 53 */   protected Object[] elementData = null;
/*    */   protected int capacityIncrement;
/*    */ 
/*    */   public Vector()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public Vector(int capacity) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Vector(int capacity, int capacityIncrement) { throw new RuntimeException("Stub!"); } 
/*  9 */   public Vector(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void add(int location, E object) { throw new RuntimeException("Stub!"); } 
/* 11 */   public synchronized boolean add(E object) { throw new RuntimeException("Stub!"); } 
/* 12 */   public synchronized boolean addAll(int location, Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 13 */   public synchronized boolean addAll(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 14 */   public synchronized void addElement(E object) { throw new RuntimeException("Stub!"); } 
/* 15 */   public synchronized int capacity() { throw new RuntimeException("Stub!"); } 
/* 16 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 17 */   public synchronized Object clone() { throw new RuntimeException("Stub!"); } 
/* 18 */   public boolean contains(Object object) { throw new RuntimeException("Stub!"); } 
/* 19 */   public synchronized boolean containsAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/* 20 */   public synchronized void copyInto(Object[] elements) { throw new RuntimeException("Stub!"); } 
/* 21 */   public synchronized E elementAt(int location) { throw new RuntimeException("Stub!"); } 
/* 22 */   public Enumeration<E> elements() { throw new RuntimeException("Stub!"); } 
/* 23 */   public synchronized void ensureCapacity(int minimumCapacity) { throw new RuntimeException("Stub!"); } 
/* 24 */   public synchronized boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 25 */   public synchronized E firstElement() { throw new RuntimeException("Stub!"); } 
/* 26 */   public E get(int location) { throw new RuntimeException("Stub!"); } 
/* 27 */   public synchronized int hashCode() { throw new RuntimeException("Stub!"); } 
/* 28 */   public int indexOf(Object object) { throw new RuntimeException("Stub!"); } 
/* 29 */   public synchronized int indexOf(Object object, int location) { throw new RuntimeException("Stub!"); } 
/* 30 */   public synchronized void insertElementAt(E object, int location) { throw new RuntimeException("Stub!"); } 
/* 31 */   public synchronized boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 32 */   public synchronized E lastElement() { throw new RuntimeException("Stub!"); } 
/* 33 */   public synchronized int lastIndexOf(Object object) { throw new RuntimeException("Stub!"); } 
/* 34 */   public synchronized int lastIndexOf(Object object, int location) { throw new RuntimeException("Stub!"); } 
/* 35 */   public synchronized E remove(int location) { throw new RuntimeException("Stub!"); } 
/* 36 */   public boolean remove(Object object) { throw new RuntimeException("Stub!"); } 
/* 37 */   public synchronized boolean removeAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/* 38 */   public synchronized void removeAllElements() { throw new RuntimeException("Stub!"); } 
/* 39 */   public synchronized boolean removeElement(Object object) { throw new RuntimeException("Stub!"); } 
/* 40 */   public synchronized void removeElementAt(int location) { throw new RuntimeException("Stub!"); } 
/* 41 */   protected void removeRange(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 42 */   public synchronized boolean retainAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/* 43 */   public synchronized E set(int location, E object) { throw new RuntimeException("Stub!"); } 
/* 44 */   public synchronized void setElementAt(E object, int location) { throw new RuntimeException("Stub!"); } 
/* 45 */   public synchronized void setSize(int length) { throw new RuntimeException("Stub!"); } 
/* 46 */   public synchronized int size() { throw new RuntimeException("Stub!"); } 
/* 47 */   public synchronized List<E> subList(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 48 */   public synchronized Object[] toArray() { throw new RuntimeException("Stub!"); } 
/* 49 */   public synchronized <T> T[] toArray(T[] contents) { throw new RuntimeException("Stub!"); } 
/* 50 */   public synchronized String toString() { throw new RuntimeException("Stub!"); } 
/* 51 */   public synchronized void trimToSize() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Vector
 * JD-Core Version:    0.6.0
 */
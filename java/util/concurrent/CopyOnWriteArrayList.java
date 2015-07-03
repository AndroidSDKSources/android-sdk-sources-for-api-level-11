/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.Collection;
/*    */ import java.util.Iterator;
/*    */ import java.util.List;
/*    */ import java.util.ListIterator;
/*    */ import java.util.RandomAccess;
/*    */ 
/*    */ public class CopyOnWriteArrayList<E>
/*    */   implements List<E>, RandomAccess, Cloneable, Serializable
/*    */ {
/*    */   public CopyOnWriteArrayList()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public CopyOnWriteArrayList(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/*  7 */   public CopyOnWriteArrayList(E[] array) { throw new RuntimeException("Stub!"); } 
/*  8 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/*  9 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 10 */   public E get(int index) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean containsAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/* 13 */   public int indexOf(E object, int from) { throw new RuntimeException("Stub!"); } 
/* 14 */   public int indexOf(Object object) { throw new RuntimeException("Stub!"); } 
/* 15 */   public int lastIndexOf(E object, int to) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int lastIndexOf(Object object) { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 18 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); } 
/* 19 */   public ListIterator<E> listIterator(int index) { throw new RuntimeException("Stub!"); } 
/* 20 */   public ListIterator<E> listIterator() { throw new RuntimeException("Stub!"); } 
/* 21 */   public List<E> subList(int from, int to) { throw new RuntimeException("Stub!"); } 
/* 22 */   public Object[] toArray() { throw new RuntimeException("Stub!"); } 
/* 23 */   public <T> T[] toArray(T[] contents) { throw new RuntimeException("Stub!"); } 
/* 24 */   public boolean equals(Object other) { throw new RuntimeException("Stub!"); } 
/* 25 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 26 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 27 */   public synchronized boolean add(E e) { throw new RuntimeException("Stub!"); } 
/* 28 */   public synchronized void add(int index, E e) { throw new RuntimeException("Stub!"); } 
/* 29 */   public synchronized boolean addAll(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 30 */   public synchronized boolean addAll(int index, Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 31 */   public synchronized int addAllAbsent(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 32 */   public synchronized boolean addIfAbsent(E object) { throw new RuntimeException("Stub!"); } 
/* 33 */   public synchronized void clear() { throw new RuntimeException("Stub!"); } 
/* 34 */   public synchronized E remove(int index) { throw new RuntimeException("Stub!"); } 
/* 35 */   public synchronized boolean remove(Object o) { throw new RuntimeException("Stub!"); } 
/* 36 */   public synchronized boolean removeAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/* 37 */   public synchronized boolean retainAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/* 38 */   public synchronized E set(int index, E e) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.CopyOnWriteArrayList
 * JD-Core Version:    0.6.0
 */
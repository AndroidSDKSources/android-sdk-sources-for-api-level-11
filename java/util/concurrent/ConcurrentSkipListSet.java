/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractSet;
/*    */ import java.util.Collection;
/*    */ import java.util.Comparator;
/*    */ import java.util.Iterator;
/*    */ import java.util.NavigableSet;
/*    */ import java.util.SortedSet;
/*    */ 
/*    */ public class ConcurrentSkipListSet<E> extends AbstractSet<E>
/*    */   implements NavigableSet<E>, Cloneable, Serializable
/*    */ {
/*    */   public ConcurrentSkipListSet()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ConcurrentSkipListSet(Comparator<? super E> comparator) { throw new RuntimeException("Stub!"); } 
/*  8 */   public ConcurrentSkipListSet(Collection<? extends E> c) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ConcurrentSkipListSet(SortedSet<E> s) { throw new RuntimeException("Stub!"); } 
/* 10 */   public ConcurrentSkipListSet<E> clone() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 13 */   public boolean contains(Object o) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean add(E e) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean remove(Object o) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 17 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); } 
/* 18 */   public Iterator<E> descendingIterator() { throw new RuntimeException("Stub!"); } 
/* 19 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 20 */   public boolean removeAll(Collection<?> c) { throw new RuntimeException("Stub!"); } 
/* 21 */   public E lower(E e) { throw new RuntimeException("Stub!"); } 
/* 22 */   public E floor(E e) { throw new RuntimeException("Stub!"); } 
/* 23 */   public E ceiling(E e) { throw new RuntimeException("Stub!"); } 
/* 24 */   public E higher(E e) { throw new RuntimeException("Stub!"); } 
/* 25 */   public E pollFirst() { throw new RuntimeException("Stub!"); } 
/* 26 */   public E pollLast() { throw new RuntimeException("Stub!"); } 
/* 27 */   public Comparator<? super E> comparator() { throw new RuntimeException("Stub!"); } 
/* 28 */   public E first() { throw new RuntimeException("Stub!"); } 
/* 29 */   public E last() { throw new RuntimeException("Stub!"); } 
/* 30 */   public NavigableSet<E> subSet(E fromElement, boolean fromInclusive, E toElement, boolean toInclusive) { throw new RuntimeException("Stub!"); } 
/* 31 */   public NavigableSet<E> headSet(E toElement, boolean inclusive) { throw new RuntimeException("Stub!"); } 
/* 32 */   public NavigableSet<E> tailSet(E fromElement, boolean inclusive) { throw new RuntimeException("Stub!"); } 
/* 33 */   public NavigableSet<E> subSet(E fromElement, E toElement) { throw new RuntimeException("Stub!"); } 
/* 34 */   public NavigableSet<E> headSet(E toElement) { throw new RuntimeException("Stub!"); } 
/* 35 */   public NavigableSet<E> tailSet(E fromElement) { throw new RuntimeException("Stub!"); } 
/* 36 */   public NavigableSet<E> descendingSet() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.ConcurrentSkipListSet
 * JD-Core Version:    0.6.0
 */
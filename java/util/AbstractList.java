/*    */ package java.util;
/*    */ 
/*    */ public abstract class AbstractList<E> extends AbstractCollection<E>
/*    */   implements List<E>
/*    */ {
/*    */   protected transient int modCount;
/*    */ 
/*    */   protected AbstractList()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public void add(int location, E object) { throw new RuntimeException("Stub!"); } 
/*  8 */   public boolean add(E object) { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean addAll(int location, Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 10 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract E get(int paramInt);
/*    */ 
/* 13 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 14 */   public int indexOf(Object object) { throw new RuntimeException("Stub!"); } 
/* 15 */   public Iterator<E> iterator() { throw new RuntimeException("Stub!"); } 
/* 16 */   public int lastIndexOf(Object object) { throw new RuntimeException("Stub!"); } 
/* 17 */   public ListIterator<E> listIterator() { throw new RuntimeException("Stub!"); } 
/* 18 */   public ListIterator<E> listIterator(int location) { throw new RuntimeException("Stub!"); } 
/* 19 */   public E remove(int location) { throw new RuntimeException("Stub!"); } 
/* 20 */   protected void removeRange(int start, int end) { throw new RuntimeException("Stub!"); } 
/* 21 */   public E set(int location, E object) { throw new RuntimeException("Stub!"); } 
/* 22 */   public List<E> subList(int start, int end) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.AbstractList
 * JD-Core Version:    0.6.0
 */
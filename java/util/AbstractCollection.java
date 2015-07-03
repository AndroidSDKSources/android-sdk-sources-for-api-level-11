/*    */ package java.util;
/*    */ 
/*    */ public abstract class AbstractCollection<E>
/*    */   implements Collection<E>
/*    */ {
/*    */   protected AbstractCollection()
/*    */   {
/*  5 */     throw new RuntimeException("Stub!"); } 
/*  6 */   public boolean add(E object) { throw new RuntimeException("Stub!"); } 
/*  7 */   public boolean addAll(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/*  8 */   public void clear() { throw new RuntimeException("Stub!"); } 
/*  9 */   public boolean contains(Object object) { throw new RuntimeException("Stub!"); } 
/* 10 */   public boolean containsAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Iterator<E> iterator();
/*    */ 
/* 13 */   public boolean remove(Object object) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean removeAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean retainAll(Collection<?> collection) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract int size();
/*    */ 
/* 17 */   public Object[] toArray() { throw new RuntimeException("Stub!"); } 
/* 18 */   public <T> T[] toArray(T[] contents) { throw new RuntimeException("Stub!"); } 
/* 19 */   public String toString() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.AbstractCollection
 * JD-Core Version:    0.6.0
 */
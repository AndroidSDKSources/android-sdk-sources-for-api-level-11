/*   */ package java.util;
/*   */ 
/*   */ public abstract class Dictionary<K, V>
/*   */ {
/*   */   public Dictionary()
/*   */   {
/* 4 */     throw new RuntimeException("Stub!");
/*   */   }
/*   */ 
/*   */   public abstract Enumeration<V> elements();
/*   */ 
/*   */   public abstract V get(Object paramObject);
/*   */ 
/*   */   public abstract boolean isEmpty();
/*   */ 
/*   */   public abstract Enumeration<K> keys();
/*   */ 
/*   */   public abstract V put(K paramK, V paramV);
/*   */ 
/*   */   public abstract V remove(Object paramObject);
/*   */ 
/*   */   public abstract int size();
/*   */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Dictionary
 * JD-Core Version:    0.6.0
 */
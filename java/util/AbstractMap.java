/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public abstract class AbstractMap<K, V>
/*    */   implements Map<K, V>
/*    */ {
/*    */   protected AbstractMap()
/*    */   {
/* 29 */     throw new RuntimeException("Stub!"); } 
/* 30 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 31 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); } 
/* 32 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); } 
/*    */   public abstract Set<Map.Entry<K, V>> entrySet();
/*    */ 
/* 34 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 35 */   public V get(Object key) { throw new RuntimeException("Stub!"); } 
/* 36 */   public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 37 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 38 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); } 
/* 39 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 40 */   public void putAll(Map<? extends K, ? extends V> map) { throw new RuntimeException("Stub!"); } 
/* 41 */   public V remove(Object key) { throw new RuntimeException("Stub!"); } 
/* 42 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 43 */   public String toString() { throw new RuntimeException("Stub!"); } 
/* 44 */   public Collection<V> values() { throw new RuntimeException("Stub!"); } 
/* 45 */   protected Object clone() throws CloneNotSupportedException { throw new RuntimeException("Stub!");
/*    */   }
/*    */ 
/*    */   public static class SimpleEntry<K, V>
/*    */     implements Map.Entry<K, V>, Serializable
/*    */   {
/*    */     public SimpleEntry(K theKey, V theValue)
/*    */     {
/* 20 */       throw new RuntimeException("Stub!"); } 
/* 21 */     public SimpleEntry(Map.Entry<? extends K, ? extends V> copyFrom) { throw new RuntimeException("Stub!"); } 
/* 22 */     public K getKey() { throw new RuntimeException("Stub!"); } 
/* 23 */     public V getValue() { throw new RuntimeException("Stub!"); } 
/* 24 */     public V setValue(V object) { throw new RuntimeException("Stub!"); } 
/* 25 */     public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 26 */     public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 27 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ 
/*    */   public static class SimpleImmutableEntry<K, V>
/*    */     implements Map.Entry<K, V>, Serializable
/*    */   {
/*    */     public SimpleImmutableEntry(K theKey, V theValue)
/*    */     {
/*  8 */       throw new RuntimeException("Stub!"); } 
/*  9 */     public SimpleImmutableEntry(Map.Entry<? extends K, ? extends V> copyFrom) { throw new RuntimeException("Stub!"); } 
/* 10 */     public K getKey() { throw new RuntimeException("Stub!"); } 
/* 11 */     public V getValue() { throw new RuntimeException("Stub!"); } 
/* 12 */     public V setValue(V object) { throw new RuntimeException("Stub!"); } 
/* 13 */     public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 14 */     public int hashCode() { throw new RuntimeException("Stub!"); } 
/* 15 */     public String toString() { throw new RuntimeException("Stub!");
/*    */     }
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.AbstractMap
 * JD-Core Version:    0.6.0
 */
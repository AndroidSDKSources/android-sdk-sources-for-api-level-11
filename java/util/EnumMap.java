/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class EnumMap<K extends Enum<K>, V> extends AbstractMap<K, V>
/*    */   implements Serializable, Cloneable, Map<K, V>
/*    */ {
/*    */   public EnumMap(Class<K> keyType)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public EnumMap(EnumMap<K, ? extends V> map) { throw new RuntimeException("Stub!"); } 
/*  8 */   public EnumMap(Map<K, ? extends V> map) { throw new RuntimeException("Stub!"); } 
/*  9 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 10 */   public EnumMap<K, V> clone() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); } 
/* 13 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean equals(Object object) { throw new RuntimeException("Stub!"); } 
/* 15 */   public V get(Object key) { throw new RuntimeException("Stub!"); } 
/* 16 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); } 
/* 17 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 18 */   public void putAll(Map<? extends K, ? extends V> map) { throw new RuntimeException("Stub!"); } 
/* 19 */   public V remove(Object key) { throw new RuntimeException("Stub!"); } 
/* 20 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 21 */   public Collection<V> values() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.EnumMap
 * JD-Core Version:    0.6.0
 */
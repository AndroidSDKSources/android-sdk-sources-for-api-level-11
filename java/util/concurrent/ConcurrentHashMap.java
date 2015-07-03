/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractMap;
/*    */ import java.util.Collection;
/*    */ import java.util.Enumeration;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.Set;
/*    */ 
/*    */ public class ConcurrentHashMap<K, V> extends AbstractMap<K, V>
/*    */   implements ConcurrentMap<K, V>, Serializable
/*    */ {
/*    */   public ConcurrentHashMap(int initialCapacity, float loadFactor, int concurrencyLevel)
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ConcurrentHashMap(int initialCapacity, float loadFactor) { throw new RuntimeException("Stub!"); } 
/*  8 */   public ConcurrentHashMap(int initialCapacity) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ConcurrentHashMap() { throw new RuntimeException("Stub!"); } 
/* 10 */   public ConcurrentHashMap(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 12 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 13 */   public V get(Object key) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); } 
/* 16 */   public boolean contains(Object value) { throw new RuntimeException("Stub!"); } 
/* 17 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 18 */   public V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 19 */   public void putAll(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); } 
/* 20 */   public V remove(Object key) { throw new RuntimeException("Stub!"); } 
/* 21 */   public boolean remove(Object key, Object value) { throw new RuntimeException("Stub!"); } 
/* 22 */   public boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); } 
/* 23 */   public V replace(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 24 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 25 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); } 
/* 26 */   public Collection<V> values() { throw new RuntimeException("Stub!"); } 
/* 27 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); } 
/* 28 */   public Enumeration<K> keys() { throw new RuntimeException("Stub!"); } 
/* 29 */   public Enumeration<V> elements() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.ConcurrentHashMap
 * JD-Core Version:    0.6.0
 */
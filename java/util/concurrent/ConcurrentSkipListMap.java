/*    */ package java.util.concurrent;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.AbstractMap;
/*    */ import java.util.Collection;
/*    */ import java.util.Comparator;
/*    */ import java.util.Map;
/*    */ import java.util.Map.Entry;
/*    */ import java.util.NavigableSet;
/*    */ import java.util.Set;
/*    */ import java.util.SortedMap;
/*    */ 
/*    */ public class ConcurrentSkipListMap<K, V> extends AbstractMap<K, V>
/*    */   implements ConcurrentNavigableMap<K, V>, Cloneable, Serializable
/*    */ {
/*    */   public ConcurrentSkipListMap()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public ConcurrentSkipListMap(Comparator<? super K> comparator) { throw new RuntimeException("Stub!"); } 
/*  8 */   public ConcurrentSkipListMap(Map<? extends K, ? extends V> m) { throw new RuntimeException("Stub!"); } 
/*  9 */   public ConcurrentSkipListMap(SortedMap<K, ? extends V> m) { throw new RuntimeException("Stub!"); } 
/* 10 */   public ConcurrentSkipListMap<K, V> clone() { throw new RuntimeException("Stub!"); } 
/* 11 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); } 
/* 12 */   public V get(Object key) { throw new RuntimeException("Stub!"); } 
/* 13 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 14 */   public V remove(Object key) { throw new RuntimeException("Stub!"); } 
/* 15 */   public boolean containsValue(Object value) { throw new RuntimeException("Stub!"); } 
/* 16 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 17 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 18 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 19 */   public NavigableSet<K> keySet() { throw new RuntimeException("Stub!"); } 
/* 20 */   public NavigableSet<K> navigableKeySet() { throw new RuntimeException("Stub!"); } 
/* 21 */   public Collection<V> values() { throw new RuntimeException("Stub!"); } 
/* 22 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); } 
/* 23 */   public ConcurrentNavigableMap<K, V> descendingMap() { throw new RuntimeException("Stub!"); } 
/* 24 */   public NavigableSet<K> descendingKeySet() { throw new RuntimeException("Stub!"); } 
/* 25 */   public boolean equals(Object o) { throw new RuntimeException("Stub!"); } 
/* 26 */   public V putIfAbsent(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 27 */   public boolean remove(Object key, Object value) { throw new RuntimeException("Stub!"); } 
/* 28 */   public boolean replace(K key, V oldValue, V newValue) { throw new RuntimeException("Stub!"); } 
/* 29 */   public V replace(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 30 */   public Comparator<? super K> comparator() { throw new RuntimeException("Stub!"); } 
/* 31 */   public K firstKey() { throw new RuntimeException("Stub!"); } 
/* 32 */   public K lastKey() { throw new RuntimeException("Stub!"); } 
/* 33 */   public ConcurrentNavigableMap<K, V> subMap(K fromKey, boolean fromInclusive, K toKey, boolean toInclusive) { throw new RuntimeException("Stub!"); } 
/* 34 */   public ConcurrentNavigableMap<K, V> headMap(K toKey, boolean inclusive) { throw new RuntimeException("Stub!"); } 
/* 35 */   public ConcurrentNavigableMap<K, V> tailMap(K fromKey, boolean inclusive) { throw new RuntimeException("Stub!"); } 
/* 36 */   public ConcurrentNavigableMap<K, V> subMap(K fromKey, K toKey) { throw new RuntimeException("Stub!"); } 
/* 37 */   public ConcurrentNavigableMap<K, V> headMap(K toKey) { throw new RuntimeException("Stub!"); } 
/* 38 */   public ConcurrentNavigableMap<K, V> tailMap(K fromKey) { throw new RuntimeException("Stub!"); } 
/* 39 */   public Map.Entry<K, V> lowerEntry(K key) { throw new RuntimeException("Stub!"); } 
/* 40 */   public K lowerKey(K key) { throw new RuntimeException("Stub!"); } 
/* 41 */   public Map.Entry<K, V> floorEntry(K key) { throw new RuntimeException("Stub!"); } 
/* 42 */   public K floorKey(K key) { throw new RuntimeException("Stub!"); } 
/* 43 */   public Map.Entry<K, V> ceilingEntry(K key) { throw new RuntimeException("Stub!"); } 
/* 44 */   public K ceilingKey(K key) { throw new RuntimeException("Stub!"); } 
/* 45 */   public Map.Entry<K, V> higherEntry(K key) { throw new RuntimeException("Stub!"); } 
/* 46 */   public K higherKey(K key) { throw new RuntimeException("Stub!"); } 
/* 47 */   public Map.Entry<K, V> firstEntry() { throw new RuntimeException("Stub!"); } 
/* 48 */   public Map.Entry<K, V> lastEntry() { throw new RuntimeException("Stub!"); } 
/* 49 */   public Map.Entry<K, V> pollFirstEntry() { throw new RuntimeException("Stub!"); } 
/* 50 */   public Map.Entry<K, V> pollLastEntry() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.ConcurrentSkipListMap
 * JD-Core Version:    0.6.0
 */
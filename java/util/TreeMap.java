/*    */ package java.util;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ 
/*    */ public class TreeMap<K, V> extends AbstractMap<K, V>
/*    */   implements SortedMap<K, V>, NavigableMap<K, V>, Cloneable, Serializable
/*    */ {
/*    */   public TreeMap()
/*    */   {
/*  6 */     throw new RuntimeException("Stub!"); } 
/*  7 */   public TreeMap(Map<? extends K, ? extends V> copyFrom) { throw new RuntimeException("Stub!"); } 
/*  8 */   public TreeMap(Comparator<? super K> comparator) { throw new RuntimeException("Stub!"); } 
/*  9 */   public TreeMap(SortedMap<K, ? extends V> copyFrom) { throw new RuntimeException("Stub!"); } 
/* 10 */   public Object clone() { throw new RuntimeException("Stub!"); } 
/* 11 */   public int size() { throw new RuntimeException("Stub!"); } 
/* 12 */   public boolean isEmpty() { throw new RuntimeException("Stub!"); } 
/* 13 */   public V get(Object key) { throw new RuntimeException("Stub!"); } 
/* 14 */   public boolean containsKey(Object key) { throw new RuntimeException("Stub!"); } 
/* 15 */   public V put(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 16 */   public void clear() { throw new RuntimeException("Stub!"); } 
/* 17 */   public V remove(Object key) { throw new RuntimeException("Stub!"); } 
/* 18 */   public Map.Entry<K, V> firstEntry() { throw new RuntimeException("Stub!"); } 
/* 19 */   public Map.Entry<K, V> pollFirstEntry() { throw new RuntimeException("Stub!"); } 
/* 20 */   public K firstKey() { throw new RuntimeException("Stub!"); } 
/* 21 */   public Map.Entry<K, V> lastEntry() { throw new RuntimeException("Stub!"); } 
/* 22 */   public Map.Entry<K, V> pollLastEntry() { throw new RuntimeException("Stub!"); } 
/* 23 */   public K lastKey() { throw new RuntimeException("Stub!"); } 
/* 24 */   public Map.Entry<K, V> lowerEntry(K key) { throw new RuntimeException("Stub!"); } 
/* 25 */   public K lowerKey(K key) { throw new RuntimeException("Stub!"); } 
/* 26 */   public Map.Entry<K, V> floorEntry(K key) { throw new RuntimeException("Stub!"); } 
/* 27 */   public K floorKey(K key) { throw new RuntimeException("Stub!"); } 
/* 28 */   public Map.Entry<K, V> ceilingEntry(K key) { throw new RuntimeException("Stub!"); } 
/* 29 */   public K ceilingKey(K key) { throw new RuntimeException("Stub!"); } 
/* 30 */   public Map.Entry<K, V> higherEntry(K key) { throw new RuntimeException("Stub!"); } 
/* 31 */   public K higherKey(K key) { throw new RuntimeException("Stub!"); } 
/* 32 */   public Comparator<? super K> comparator() { throw new RuntimeException("Stub!"); } 
/* 33 */   public Set<Map.Entry<K, V>> entrySet() { throw new RuntimeException("Stub!"); } 
/* 34 */   public Set<K> keySet() { throw new RuntimeException("Stub!"); } 
/* 35 */   public NavigableSet<K> navigableKeySet() { throw new RuntimeException("Stub!"); } 
/* 36 */   public NavigableMap<K, V> subMap(K from, boolean fromInclusive, K to, boolean toInclusive) { throw new RuntimeException("Stub!"); } 
/* 37 */   public SortedMap<K, V> subMap(K fromInclusive, K toExclusive) { throw new RuntimeException("Stub!"); } 
/* 38 */   public NavigableMap<K, V> headMap(K to, boolean inclusive) { throw new RuntimeException("Stub!"); } 
/* 39 */   public SortedMap<K, V> headMap(K toExclusive) { throw new RuntimeException("Stub!"); } 
/* 40 */   public NavigableMap<K, V> tailMap(K from, boolean inclusive) { throw new RuntimeException("Stub!"); } 
/* 41 */   public SortedMap<K, V> tailMap(K fromInclusive) { throw new RuntimeException("Stub!"); } 
/* 42 */   public NavigableMap<K, V> descendingMap() { throw new RuntimeException("Stub!"); } 
/* 43 */   public NavigableSet<K> descendingKeySet() { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.TreeMap
 * JD-Core Version:    0.6.0
 */
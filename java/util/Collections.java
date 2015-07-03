/*    */ package java.util;
/*    */ 
/*    */ public class Collections
/*    */ {
/* 60 */   public static final List EMPTY_LIST = null; public static final Set EMPTY_SET = null; public static final Map EMPTY_MAP = null;
/*    */ 
/*    */   Collections()
/*    */   {
/*  4 */     throw new RuntimeException("Stub!"); } 
/*  5 */   public static <T> int binarySearch(List<? extends Comparable<? super T>> list, T object) { throw new RuntimeException("Stub!"); } 
/*  6 */   public static <T> int binarySearch(List<? extends T> list, T object, Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); } 
/*  7 */   public static <T> void copy(List<? super T> destination, List<? extends T> source) { throw new RuntimeException("Stub!"); } 
/*  8 */   public static <T> Enumeration<T> enumeration(Collection<T> collection) { throw new RuntimeException("Stub!"); } 
/*  9 */   public static <T> void fill(List<? super T> list, T object) { throw new RuntimeException("Stub!"); } 
/* 10 */   public static <T,  extends Comparable<? super T>> T max(Collection<? extends T> collection) { throw new RuntimeException("Stub!"); } 
/* 11 */   public static <T> T max(Collection<? extends T> collection, Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); } 
/* 12 */   public static <T,  extends Comparable<? super T>> T min(Collection<? extends T> collection) { throw new RuntimeException("Stub!"); } 
/* 13 */   public static <T> T min(Collection<? extends T> collection, Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); } 
/* 14 */   public static <T> List<T> nCopies(int length, T object) { throw new RuntimeException("Stub!"); } 
/* 15 */   public static void reverse(List<?> list) { throw new RuntimeException("Stub!"); } 
/* 16 */   public static <T> Comparator<T> reverseOrder() { throw new RuntimeException("Stub!"); } 
/* 17 */   public static <T> Comparator<T> reverseOrder(Comparator<T> c) { throw new RuntimeException("Stub!"); } 
/* 18 */   public static void shuffle(List<?> list) { throw new RuntimeException("Stub!"); } 
/* 19 */   public static void shuffle(List<?> list, Random random) { throw new RuntimeException("Stub!"); } 
/* 20 */   public static <E> Set<E> singleton(E object) { throw new RuntimeException("Stub!"); } 
/* 21 */   public static <E> List<E> singletonList(E object) { throw new RuntimeException("Stub!"); } 
/* 22 */   public static <K, V> Map<K, V> singletonMap(K key, V value) { throw new RuntimeException("Stub!"); } 
/* 23 */   public static <T extends Comparable<? super T>> void sort(List<T> list) { throw new RuntimeException("Stub!"); } 
/* 24 */   public static <T> void sort(List<T> list, Comparator<? super T> comparator) { throw new RuntimeException("Stub!"); } 
/* 25 */   public static void swap(List<?> list, int index1, int index2) { throw new RuntimeException("Stub!"); } 
/* 26 */   public static <T> boolean replaceAll(List<T> list, T obj, T obj2) { throw new RuntimeException("Stub!"); } 
/* 27 */   public static void rotate(List<?> lst, int dist) { throw new RuntimeException("Stub!"); } 
/* 28 */   public static int indexOfSubList(List<?> list, List<?> sublist) { throw new RuntimeException("Stub!"); } 
/* 29 */   public static int lastIndexOfSubList(List<?> list, List<?> sublist) { throw new RuntimeException("Stub!"); } 
/* 30 */   public static <T> ArrayList<T> list(Enumeration<T> enumeration) { throw new RuntimeException("Stub!"); } 
/* 31 */   public static <T> Collection<T> synchronizedCollection(Collection<T> collection) { throw new RuntimeException("Stub!"); } 
/* 32 */   public static <T> List<T> synchronizedList(List<T> list) { throw new RuntimeException("Stub!"); } 
/* 33 */   public static <K, V> Map<K, V> synchronizedMap(Map<K, V> map) { throw new RuntimeException("Stub!"); } 
/* 34 */   public static <E> Set<E> synchronizedSet(Set<E> set) { throw new RuntimeException("Stub!"); } 
/* 35 */   public static <K, V> SortedMap<K, V> synchronizedSortedMap(SortedMap<K, V> map) { throw new RuntimeException("Stub!"); } 
/* 36 */   public static <E> SortedSet<E> synchronizedSortedSet(SortedSet<E> set) { throw new RuntimeException("Stub!"); } 
/* 37 */   public static <E> Collection<E> unmodifiableCollection(Collection<? extends E> collection) { throw new RuntimeException("Stub!"); } 
/* 38 */   public static <E> List<E> unmodifiableList(List<? extends E> list) { throw new RuntimeException("Stub!"); } 
/* 39 */   public static <K, V> Map<K, V> unmodifiableMap(Map<? extends K, ? extends V> map) { throw new RuntimeException("Stub!"); } 
/* 40 */   public static <E> Set<E> unmodifiableSet(Set<? extends E> set) { throw new RuntimeException("Stub!"); } 
/* 41 */   public static <K, V> SortedMap<K, V> unmodifiableSortedMap(SortedMap<K, ? extends V> map) { throw new RuntimeException("Stub!"); } 
/* 42 */   public static <E> SortedSet<E> unmodifiableSortedSet(SortedSet<E> set) { throw new RuntimeException("Stub!"); } 
/* 43 */   public static int frequency(Collection<?> c, Object o) { throw new RuntimeException("Stub!"); } 
/* 44 */   public static final <T> List<T> emptyList() { throw new RuntimeException("Stub!"); } 
/* 45 */   public static final <T> Set<T> emptySet() { throw new RuntimeException("Stub!"); } 
/* 46 */   public static final <K, V> Map<K, V> emptyMap() { throw new RuntimeException("Stub!"); } 
/* 47 */   public static <E> Collection<E> checkedCollection(Collection<E> c, Class<E> type) { throw new RuntimeException("Stub!"); } 
/* 48 */   public static <K, V> Map<K, V> checkedMap(Map<K, V> m, Class<K> keyType, Class<V> valueType) { throw new RuntimeException("Stub!"); } 
/* 49 */   public static <E> List<E> checkedList(List<E> list, Class<E> type) { throw new RuntimeException("Stub!"); } 
/* 50 */   public static <E> Set<E> checkedSet(Set<E> s, Class<E> type) { throw new RuntimeException("Stub!"); } 
/* 51 */   public static <K, V> SortedMap<K, V> checkedSortedMap(SortedMap<K, V> m, Class<K> keyType, Class<V> valueType) { throw new RuntimeException("Stub!"); } 
/* 52 */   public static <E> SortedSet<E> checkedSortedSet(SortedSet<E> s, Class<E> type) { throw new RuntimeException("Stub!"); } 
/* 53 */   public static <T> boolean addAll(Collection<? super T> c, T[] a) { throw new RuntimeException("Stub!"); } 
/* 54 */   public static boolean disjoint(Collection<?> c1, Collection<?> c2) { throw new RuntimeException("Stub!"); } 
/* 55 */   public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) { throw new RuntimeException("Stub!"); } 
/* 56 */   public static <T> Queue<T> asLifoQueue(Deque<T> deque) { throw new RuntimeException("Stub!");
/*    */   }
/*    */ }

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Collections
 * JD-Core Version:    0.6.0
 */
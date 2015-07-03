package java.util;

public abstract interface SortedMap<K, V> extends Map<K, V>
{
  public abstract Comparator<? super K> comparator();

  public abstract K firstKey();

  public abstract SortedMap<K, V> headMap(K paramK);

  public abstract K lastKey();

  public abstract SortedMap<K, V> subMap(K paramK1, K paramK2);

  public abstract SortedMap<K, V> tailMap(K paramK);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.SortedMap
 * JD-Core Version:    0.6.0
 */
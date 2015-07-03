package java.util;

public abstract interface Map<K, V>
{
  public abstract void clear();

  public abstract boolean containsKey(Object paramObject);

  public abstract boolean containsValue(Object paramObject);

  public abstract Set<Entry<K, V>> entrySet();

  public abstract boolean equals(Object paramObject);

  public abstract V get(Object paramObject);

  public abstract int hashCode();

  public abstract boolean isEmpty();

  public abstract Set<K> keySet();

  public abstract V put(K paramK, V paramV);

  public abstract void putAll(Map<? extends K, ? extends V> paramMap);

  public abstract V remove(Object paramObject);

  public abstract int size();

  public abstract Collection<V> values();

  public static abstract interface Entry<K, V>
  {
    public abstract boolean equals(Object paramObject);

    public abstract K getKey();

    public abstract V getValue();

    public abstract int hashCode();

    public abstract V setValue(V paramV);
  }
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Map
 * JD-Core Version:    0.6.0
 */
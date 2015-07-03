package java.util.concurrent;

import java.util.Map;

public abstract interface ConcurrentMap<K, V> extends Map<K, V>
{
  public abstract V putIfAbsent(K paramK, V paramV);

  public abstract boolean remove(Object paramObject1, Object paramObject2);

  public abstract boolean replace(K paramK, V paramV1, V paramV2);

  public abstract V replace(K paramK, V paramV);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.ConcurrentMap
 * JD-Core Version:    0.6.0
 */
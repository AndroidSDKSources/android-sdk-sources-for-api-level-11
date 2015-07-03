package java.util;

public abstract interface List<E> extends Collection<E>
{
  public abstract void add(int paramInt, E paramE);

  public abstract boolean add(E paramE);

  public abstract boolean addAll(int paramInt, Collection<? extends E> paramCollection);

  public abstract boolean addAll(Collection<? extends E> paramCollection);

  public abstract void clear();

  public abstract boolean contains(Object paramObject);

  public abstract boolean containsAll(Collection<?> paramCollection);

  public abstract boolean equals(Object paramObject);

  public abstract E get(int paramInt);

  public abstract int hashCode();

  public abstract int indexOf(Object paramObject);

  public abstract boolean isEmpty();

  public abstract Iterator<E> iterator();

  public abstract int lastIndexOf(Object paramObject);

  public abstract ListIterator<E> listIterator();

  public abstract ListIterator<E> listIterator(int paramInt);

  public abstract E remove(int paramInt);

  public abstract boolean remove(Object paramObject);

  public abstract boolean removeAll(Collection<?> paramCollection);

  public abstract boolean retainAll(Collection<?> paramCollection);

  public abstract E set(int paramInt, E paramE);

  public abstract int size();

  public abstract List<E> subList(int paramInt1, int paramInt2);

  public abstract Object[] toArray();

  public abstract <T> T[] toArray(T[] paramArrayOfT);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.List
 * JD-Core Version:    0.6.0
 */
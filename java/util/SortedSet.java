package java.util;

public abstract interface SortedSet<E> extends Set<E>
{
  public abstract Comparator<? super E> comparator();

  public abstract E first();

  public abstract SortedSet<E> headSet(E paramE);

  public abstract E last();

  public abstract SortedSet<E> subSet(E paramE1, E paramE2);

  public abstract SortedSet<E> tailSet(E paramE);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.SortedSet
 * JD-Core Version:    0.6.0
 */
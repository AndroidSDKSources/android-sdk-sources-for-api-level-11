package java.util;

public abstract interface ListIterator<E> extends Iterator<E>
{
  public abstract void add(E paramE);

  public abstract boolean hasNext();

  public abstract boolean hasPrevious();

  public abstract E next();

  public abstract int nextIndex();

  public abstract E previous();

  public abstract int previousIndex();

  public abstract void remove();

  public abstract void set(E paramE);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.ListIterator
 * JD-Core Version:    0.6.0
 */
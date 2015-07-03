package java.util;

public abstract interface Queue<E> extends Collection<E>
{
  public abstract boolean add(E paramE);

  public abstract boolean offer(E paramE);

  public abstract E remove();

  public abstract E poll();

  public abstract E element();

  public abstract E peek();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.Queue
 * JD-Core Version:    0.6.0
 */
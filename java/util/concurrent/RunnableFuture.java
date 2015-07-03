package java.util.concurrent;

public abstract interface RunnableFuture<V> extends Runnable, Future<V>
{
  public abstract void run();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.RunnableFuture
 * JD-Core Version:    0.6.0
 */
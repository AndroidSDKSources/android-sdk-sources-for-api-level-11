package java.util.concurrent;

public abstract interface RunnableScheduledFuture<V> extends RunnableFuture<V>, ScheduledFuture<V>
{
  public abstract boolean isPeriodic();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.RunnableScheduledFuture
 * JD-Core Version:    0.6.0
 */
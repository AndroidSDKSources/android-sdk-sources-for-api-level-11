package java.util.concurrent;

public abstract interface Delayed extends Comparable<Delayed>
{
  public abstract long getDelay(TimeUnit paramTimeUnit);
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.Delayed
 * JD-Core Version:    0.6.0
 */
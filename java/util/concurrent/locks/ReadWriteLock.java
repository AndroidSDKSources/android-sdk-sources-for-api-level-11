package java.util.concurrent.locks;

public abstract interface ReadWriteLock
{
  public abstract Lock readLock();

  public abstract Lock writeLock();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.locks.ReadWriteLock
 * JD-Core Version:    0.6.0
 */
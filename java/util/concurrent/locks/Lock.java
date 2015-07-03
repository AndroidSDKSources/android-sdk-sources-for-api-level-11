package java.util.concurrent.locks;

import java.util.concurrent.TimeUnit;

public abstract interface Lock
{
  public abstract void lock();

  public abstract void lockInterruptibly()
    throws InterruptedException;

  public abstract boolean tryLock();

  public abstract boolean tryLock(long paramLong, TimeUnit paramTimeUnit)
    throws InterruptedException;

  public abstract void unlock();

  public abstract Condition newCondition();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.util.concurrent.locks.Lock
 * JD-Core Version:    0.6.0
 */
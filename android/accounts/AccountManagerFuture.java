package android.accounts;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public abstract interface AccountManagerFuture<V>
{
  public abstract boolean cancel(boolean paramBoolean);

  public abstract boolean isCancelled();

  public abstract boolean isDone();

  public abstract V getResult()
    throws OperationCanceledException, IOException, AuthenticatorException;

  public abstract V getResult(long paramLong, TimeUnit paramTimeUnit)
    throws OperationCanceledException, IOException, AuthenticatorException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     android.accounts.AccountManagerFuture
 * JD-Core Version:    0.6.0
 */
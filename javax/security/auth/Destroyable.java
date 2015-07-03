package javax.security.auth;

public abstract interface Destroyable
{
  public abstract void destroy()
    throws DestroyFailedException;

  public abstract boolean isDestroyed();
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.security.auth.Destroyable
 * JD-Core Version:    0.6.0
 */
package java.security;

public abstract interface PrivilegedExceptionAction<T>
{
  public abstract T run()
    throws Exception;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.security.PrivilegedExceptionAction
 * JD-Core Version:    0.6.0
 */
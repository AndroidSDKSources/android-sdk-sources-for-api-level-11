package java.sql;

public abstract interface Wrapper
{
  public abstract <T> T unwrap(Class<T> paramClass)
    throws SQLException;

  public abstract boolean isWrapperFor(Class<?> paramClass)
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.Wrapper
 * JD-Core Version:    0.6.0
 */
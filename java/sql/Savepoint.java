package java.sql;

public abstract interface Savepoint
{
  public abstract int getSavepointId()
    throws SQLException;

  public abstract String getSavepointName()
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     java.sql.Savepoint
 * JD-Core Version:    0.6.0
 */
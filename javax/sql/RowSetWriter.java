package javax.sql;

import java.sql.SQLException;

public abstract interface RowSetWriter
{
  public abstract boolean writeData(RowSetInternal paramRowSetInternal)
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.sql.RowSetWriter
 * JD-Core Version:    0.6.0
 */
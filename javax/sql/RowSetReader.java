package javax.sql;

import java.sql.SQLException;

public abstract interface RowSetReader
{
  public abstract void readData(RowSetInternal paramRowSetInternal)
    throws SQLException;
}

/* Location:           D:\xyh\Android_3.0\android.jar
 * Qualified Name:     javax.sql.RowSetReader
 * JD-Core Version:    0.6.0
 */